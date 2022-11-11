//Q.1 WAJP to read 1st three line of a text file
package IO;

import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
 
public class FirstThreeLine {
 
    public static void main(String a[]){ 
        String lines = ""; // string type variables to store the actual lines
        try {
            LineNumberReader reader = 
            		new LineNumberReader(new InputStreamReader(new FileInputStream("F://test.txt"))); // taking a file input path and creating object to read the line number
             while (((lines = reader.readLine()) != null) && reader.getLineNumber() <= 3){ // checking whether the line is blank or line number is less than 4
                System.out.println(lines); // printing lines 
            }
           reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }}