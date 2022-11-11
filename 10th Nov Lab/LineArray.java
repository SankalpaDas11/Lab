//Q.3 WAJP to store text file content line by line into an array.
package IO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class LineArray {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder(); // creating object of string builder
        String strLine = ""; // string type variable to store the lines
        List<String> list = new ArrayList<String>(); // taking a new string type arraylist
        try {
             BufferedReader br = new BufferedReader(new FileReader("F://test.txt")); // input file path in bufferedbuilder object
              while (strLine != null)
               {
                strLine = br.readLine(); // storing lines
                sb.append(strLine); // adding lines
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null) // checking whether any lines left
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray())); // printing array 
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}