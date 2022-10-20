//Write a program in Java to create a file in Java using Exception Handling.
package Exception;
import java.io.File;  
import java.io.IOException;  
public class CreateFile {  
	public static void main(String[] args)   {     
		File newfile = new File("F:\\music.txt"); //initialize File object and passing path as argument  
		boolean result;  
		try {  
			result = newfile.createNewFile();  //creating a new file with createNewFile method
			if(result==true) { // checking if a new file is successfully created     
				System.out.println("File created "+newfile.getCanonicalPath());} //printing the path string of the new file
			else {  
				System.out.println("File already exist at location: "+newfile.getCanonicalPath()); } //printing if the file is already exists
		}   
		catch (IOException e){  
			e.printStackTrace();  //printing exception if any exception occur
		}         
	}  
}  