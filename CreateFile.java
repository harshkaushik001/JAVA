import java.io.File;
import java.io.IOException;
class CreateFile{
	public static void main(String args[]){
	try{
	File f0=new File("C:FileOperationExample.txt");
	if(f0.createNewFile()){
	System.out.println("File "+f0.getName() + " is created successfully");
	}
	else{
	System.out.println("File is already exeist in directory");
	}
}
	catch (IOException exception){
	System.out.println("An unexpected error is occured");
	exception.printStackTrace();
	}
	}
	}
