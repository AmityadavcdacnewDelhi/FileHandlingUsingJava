package in.fi.file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class FileHandlingObject {

	public static void main(String[] args) {
		
		FileInputStream fileInputStream=null;
		ObjectInputStream objInputStream=null;
		
		try {
			fileInputStream = new FileInputStream("D:\\javaIDE\\first.txt");
			objInputStream= new ObjectInputStream(fileInputStream);
			Data objData =(Data)objInputStream.readObject();
			
			System.out.println(objData.getName());
			System.out.println(objData.getAge());
			System.out.println(objData.getSalary());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(objInputStream!=null)
					objInputStream.close();
				if(fileInputStream!=null)
					fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static  void writingObject()
	{
		
	Data objData= new Data();

	objData.setName("AMit");
	objData.setAge(54);
	objData.setSalary(12345.90f);

	FileOutputStream fileOutputStream=null;
	ObjectOutputStream objectOutputStream=null;
	try {
		fileOutputStream = new FileOutputStream("D:\\javaIDE\\first.txt");
		objectOutputStream= new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(objData);
		System.out.println("Data written");
		
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
			if(objectOutputStream!=null)
				objectOutputStream.close();
			if(fileOutputStream!=null)
				fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}
}
