/*++ 

Copyright (c) Microsoft Corporation. All rights reserved.

Module Name:

    dfshim.h

Abstract:

    Include file for ClickOnce unmanaged public APIs.

--*/

//
// Clean (or uninstalls) all online applications from ClickOnce store.
//
HRESULT CleanOnlineAppCache();
//
// Parameters
//              None.
// 
// Return Values
//              If successful returns S_OK, otherwise failure HRESULT. 
//              If a managed exception happens during this operation it returns 0x80020009 (DISP_E_EXCEPTION). 
//
//  Remarks 
//              This will start ClickOnce service if not already running.
//






//
// Retrieves Deployment information from manifest and activation url.
//
HRESULT GetDeploymentDataFromManifest(
                LPCWSTR pcwzActivationUrl, 
                LPCWSTR pcwzPathToDeploymentManifest,
                __out_ecount(*pdwIdentityBufferLength) LPWSTR pwzApplicationIdentity, 
                LPDWORD pdwIdentityBufferLength,
                __out_ecount(*pdwArchitectureBufferLength) LPWSTR pwzProcessorArchitecture, 
                LPDWORD pdwArchitectureBufferLength,
                __out_ecount(*pdwCodebaseBufferLength) LPWSTR pwzApplicationManifestCodebase, 
                LPDWORD pdwCodebaseBufferLength,
                __out_ecount(*pdwProviderBufferLength) LPWSTR pwzDeploymentProvider, 
                LPDWORD pdwProviderBufferLength);

// Parameters   
//             pwzApplicationIdentity           - pointer to a buffer to receive a NULL-terminated 
//                                                string that specifies the full application identity returned.
//             pdwIdentityBufferLength          - pointer to a DWORD that is the length of the pwzApplicationIdentity buffer, in
//                                                WCHARs. This includes the space for the NULL termination character.
//             pwzProcessorArchitecture         - pointer to a buffer to receive a NULL-terminated string that specifies the
//                                                processor architecture of the application deployment, from the manifest.
//             pdwArchitectureBufferLength      - pointer to a DWORD that is the length of the pwzProcessorArchitecture
//                                                buffer, in WCHARs.
//             pwzApplicationManifestCodebase   - pointer to a buffer to receive a NULL-terminated string that specifies
//                                                codebase of the application manifest, from the manifest.
//             pdwCodebaseBufferLength          - pointer to a DWORD that is the length of the pwzApplicationManifestCodebase
//                                                buffer, in WCHARs.
//             pwzDeploymentProvider            - pointer to a buffer to receive a NULL-terminated string that specifies the
//                                                deployment provider from the manifest, if present. Otherwise, an empty string is
//                                                returned.
//             pdwProviderBufferLength          - pointer to a DWORD that is the length of the pwzProviderBufferLength
//
//             Pointers must not be NULL. pcwzActivationUrl and pcwzPathToDeploymentManifest must not be empty.
//
// Return Values
//              S_OK if function succeeds.
//              HRESULTFROMWIN32(ERROR_INSUFFICIENT_BUFFER) if a buffer is too small. *pdwIdentityBufferLength,
//              *pdwArchitectureBufferLength, *pdwCodebaseBufferLength, *pdwProviderBufferLength have the length needed.
//              other failure HRESULTs.
//
// Remarks
//              Caller's responsibility to clean up the activation URL. E.g. escaping, removing query string.
//              Caller's responsibility to limit input length. E.g. max url length to 2k.
//
//

