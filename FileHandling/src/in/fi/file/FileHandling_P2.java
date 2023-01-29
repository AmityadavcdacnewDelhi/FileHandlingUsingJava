package in.fi.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileHandling_P2 {
   public static void main(String[] args)
   {
	   FileInputStream fileInputStream=null;
	   try {
		File objFile= new File("D:\\javaIDE\\newFolder\\file.txt");
		    fileInputStream= new FileInputStream("D:\\javaIDE\\newFolder\\file.txt");
		   byte[] data = new byte[(int)objFile.length()];
		   fileInputStream.read(data);
		   String str= new String(data);
		   System.out.println(str);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   finally
	   {
		   try
		   {
		 if(fileInputStream!=null)
			 fileInputStream.close();
		   }catch(IOException e)
		   {
			   System.out.println(e.getMessage());
		   }
	   }
   }
   private static void writeToFile()
   {
	FileOutputStream   fileOutputStream=null;
	
		try {
			fileOutputStream = new FileOutputStream("D:\\\\javaIDE\\\\first.txt");
			String data= "Welcome to the Program";
			fileOutputStream.write(data.getBytes());
			System.out.println("File Written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fileOutputStream!=null)
					fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
   }

