#include <windows.h>
#include <winnt.h>
#include <tchar.h>
#include <iostream>
#include <iomanip>

int _tmain(int argc, TCHAR *argv[]) {
	LPCTSTR binname = argv[1];
	if (binname == 0 || _tcslen(binname) == 0) {
		std::cerr << "No file given" << std::endl;
		return 2; // Not gon do anything
	}
	
	HANDLE binfile = CreateFile(
		binname,
		GENERIC_READ,
		FILE_SHARE_READ,
		NULL,
		OPEN_EXISTING,
		FILE_ATTRIBUTE_NORMAL,
		NULL);
	if (binfile == INVALID_HANDLE_VALUE) {
		std::cerr << "Failed to open file" << std::endl;
		return 3; // Failed to get file
	}
	
	HANDLE binmap = CreateFileMapping(
		binfile,
		NULL,
		PAGE_READONLY,
		0,
		0,
		NULL);
	if (binmap == NULL) {
		std::cerr << "Could not map file" << std::endl;
		CloseHandle(binfile);
		return 4;
	}

	LPVOID binview = MapViewOfFile(
		binmap,
		FILE_MAP_READ,
		0,
		0,
		0);
	if (binview == NULL) {
		std::cerr << "Could not map view" << std::endl;
		CloseHandle(binfile);
		CloseHandle(binmap);
		return 5;
	}

	// Succeeded in everything! Let's first grab the DOX header
	PIMAGE_DOS_HEADER dos_header = (PIMAGE_DOS_HEADER) binview;
	// Find the PE header (The magic 4 is the NT bin magic number length)
	PIMAGE_FILE_HEADER pe_header =
		(PIMAGE_FILE_HEADER) ((DWORD) binview + dos_header->e_lfanew + 4);

#if defined(IS32)
	if (pe_header->Machine == IMAGE_FILE_MACHINE_I386)
#elif defined(IS64)
	if (pe_header->Machine == IMAGE_FILE_MACHINE_AMD64)
#endif
	{
		CloseHandle(binfile);
		CloseHandle(binmap);
		CloseHandle(binview);
		std::cout << "1" << std::endl;
		return 0;
	}
	else
	{
		CloseHandle(binfile);
		CloseHandle(binmap);
		CloseHandle(binview);
		std::cout << "0" << std::endl;
		return 1;
	}
}