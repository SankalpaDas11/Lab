//Q.2 WAJP to find the longest word in a text file

package IO;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord {
     public static void main(String [ ] args) throws FileNotFoundException {
    	 String longest_word = ""; // string type variable to store the longest word
         String current; // string type variable to store the current word for comparing
         Scanner sc = new Scanner(new File("F://test.txt")); // taking input of a file path

         while (sc.hasNext()) {
            current = sc.next();
             if (current.length() > longest_word.length()) { //logic - if the current word is bigger than the previous word then current word is stored in longest_word
               longest_word = current;
             }
         }
         System.out.println(longest_word); // printing the longest word
     }
}