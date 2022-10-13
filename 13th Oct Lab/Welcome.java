/* Q.1.1 Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it. */
package LabOct13th;
import java.util.StringTokenizer;
public class Welcome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st output :");
		String input = "Welcome to Java World"; // initializing given string in the string variable named input
		System.out.println(input);
		System.out.println("The character in 5th position is : " + input.charAt(4)); // printing 5th character
		String wel = "Welcome"; // taking the string Welcome
		int result = input.compareToIgnoreCase(wel); // comparing with previous input string
		// showing result of comparison
		if (result<0) 
			System.out.println("'" + input + "'" + " is less than " + "'" +wel + "'");
		else if(result==0) 
			System.out.println("'" + input + "'" + " is equal to " + "'" +wel + "'");
		else 
			System.out.println("'" + input + "'" + " is greater than " + "'" + wel + "'");
		input = input.concat("-Let us learn"); // concatenating the "-Let us learn" part with input string
		System.out.println("Concatenated String is : " + input); // printing new input string after concatenating
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i)=='a') {
				System.out.println("The position of 1st occurance of a is : " + (i+1)); //printing 1st position of a
				i=input.length();}}
		
/* Q.1.2 Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
1.	Adds the string ”- This is a sample program” to existing string and display it.
2.	Inserts the string “Object” into the existing string at 21st position and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it. */
		System.out.println();
		System.out.println("2nd Output :");
		System.out.println("After replacing 'a' by 'e' :" + input.replace('a', 'e')); //replacing a by e by replace method
		System.out.println("String between 4th and 10th position : " + input.substring(4, 9)); //printing string between 4th and 10th position
		System.out.println("String in lowercase : " + input.toLowerCase()); //printing lowercase of the given string
		StringBuffer sb = new StringBuffer("This is a String Buffer.");
		System.out.println(sb.append("- This is a sample program"));
		System.out.println(sb.replace(16, 22, "Builder"));
		
/* Q.1.3 Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE */
		System.out.println();
		System.out.println("3rd Output : ");
		System.out.println(sb.insert(21, "Object"));
		System.out.println(sb.reverse());
		String address = "C:/IBM/DB2/PROGRAM/DB2COPY1.EXE";
		StringTokenizer st = new StringTokenizer(address);
		System.out.println("Drive: " + st.nextToken("/"));
		System.out.println("Folders : " + st.nextToken("/") + "||" + st.nextToken("/") + "||" + st.nextToken("/"));
		System.out.println("File : " + st.nextToken("/"));
	}}