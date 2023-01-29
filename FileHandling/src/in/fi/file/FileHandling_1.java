package in.fi.file;
import java.io.File;

public class FileHandling_1 {

	public static void main(String[] args) {
//		File objFile= new File("D:\\javaIDE\\first.txt");
//		objFile.mkdirs();
//		String[] fileNames=objfile.list();
//	}
//	private static void basicFile() 
//	{
		try {
		File objFile= new File("D:\\javaIDE\\first.txt");
		
			objFile.createNewFile();
	   //  	objFile.delete();
			System.out.println("File Created");
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	}
}	
}



