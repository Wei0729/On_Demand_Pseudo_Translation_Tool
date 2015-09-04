/**
 *
 * @author trisoft-admin
 */
package esrixstringlocalization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipUtil 
{

  private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;

  public static void main(String[] args) throws Exception 
  {
      
    zipFile("C:\\test\\1846\\upload", "C:\\Documents and Settings\\wei7771\\My Documents\\NetBeansProjects\\ESRIxStringLocalization\\build\\web\\resources\\demo.zip", true);
  }

  public static void zipFile(String fileToZip, String zipFile, boolean excludeContainingFolder) throws IOException 
  {        
    ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));    

    File srcFile = new File(fileToZip);
    if(excludeContainingFolder && srcFile.isDirectory()) 
    {
      for(String fileName : srcFile.list()) 
      {
        File isFolder = new File(fileToZip + "/" + fileName);
        if (isFolder.isDirectory())
        {
            addToZip("", fileToZip + "/" + fileName, zipOut);
        }
      }
    } 
    
    else 
    {
      addToZip("", fileToZip, zipOut);
    }

    zipOut.flush();
    zipOut.close();

    System.out.println("Successfully created " + zipFile);
  }

  private static void addToZip(String path, String srcFile, ZipOutputStream zipOut) throws IOException 
  {        
    File file = new File(srcFile);
    String filePath = "".equals(path) ? file.getName() : path + "/" + file.getName();
    if (file.isDirectory()) 
    {
      for (String fileName : file.list()) 
      {             
        addToZip(filePath, srcFile + "/" + fileName, zipOut);
      }
    } 
    
    else 
    {
      zipOut.putNextEntry(new ZipEntry(filePath));
      FileInputStream in = new FileInputStream(srcFile);

      byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
      int len;
      while ((len = in.read(buffer)) != -1) 
      {
        zipOut.write(buffer, 0, len);
      }

      in.close();
    }
  }
  
  public static Vector<String> readzipfile(String filepath, String outputFolder){
		Vector<String> v = new Vector<String>();
		byte[] buffer = new byte[1024];
		try{
			File folder = new File(outputFolder);
			if(!folder.exists()){
				folder.mkdir();
			}
			
			ZipInputStream zis = new ZipInputStream(new FileInputStream(filepath));
			ZipEntry ze = zis.getNextEntry();
			while(ze != null){
				String fileName = ze.getName();
				fileName = fileName.substring(fileName.indexOf("/")+1,fileName.length());
				File newFile = new File(outputFolder + File.separator + fileName);
				System.out.println("file unzip " + newFile.getAbsoluteFile());
				v.addElement(newFile.getAbsolutePath());
				new File(newFile.getParent()).mkdir();
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while((len = zis.read(buffer)) > 0){
					fos.write(buffer, 0, len);
				}
				fos.close();
				ze = zis.getNextEntry();
			}
			
			 
	        zis.closeEntry();
	    	zis.close();
	 
	    	//System.out.println("Done");
	 
			
		}catch(Exception e){}
		return v;
	}
  
  public static void addFilesToExistingZip(File zipFile, File[] files) throws IOException {
	        // get a temp file
	    File tempFile = File.createTempFile(zipFile.getName(), null);
	        // delete it, otherwise you cannot rename your existing zip to it.
	    tempFile.delete();

	    boolean renameOk=zipFile.renameTo(tempFile);
	    if (!renameOk)
	    {
	        throw new RuntimeException("could not rename the file "+zipFile.getAbsolutePath()+" to "+tempFile.getAbsolutePath());
	    }
	    byte[] buf = new byte[1024];

	    ZipInputStream zin = new ZipInputStream(new FileInputStream(tempFile));
	    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));

	    ZipEntry entry = zin.getNextEntry();
	    while (entry != null) {
	        String name = entry.getName();
	        boolean notInFiles = true;
	        for (File f : files) {
	            if (f.getName().equals(name)) {
	                notInFiles = false;
	                break;
	            }
	        }
	        if (notInFiles) {
	            // Add ZIP entry to output stream.
	            out.putNextEntry(new ZipEntry(name));
	            // Transfer bytes from the ZIP file to the output file
	            int len;
	            while ((len = zin.read(buf)) > 0) {
	                out.write(buf, 0, len);
	            }
	        }
	        entry = zin.getNextEntry();
	    }
	    // Close the streams        
	    zin.close();
	    // Compress the files
	    for (int i = 0; i < files.length; i++) {
	        InputStream in = new FileInputStream(files[i]);
	        // Add ZIP entry to output stream.
	        out.putNextEntry(new ZipEntry(files[i].getName()));
	        // Transfer bytes from the file to the ZIP file
	        int len;
	        while ((len = in.read(buf)) > 0) {
	            out.write(buf, 0, len);
	        }
	        // Complete the entry
	        out.closeEntry();
	        in.close();
	    }
	    // Complete the ZIP file
	    out.close();
	    tempFile.delete();
	}
}