// Q.2 Write a java program to check whether a IP address is valid or not
package LabOct13th;
import java.util.Scanner;
class Line {
	String check = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = check + "." + check + "." + check + "." + check;
}
public class MyRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP addresses to check : ");
		while(sc.hasNext()) {
			String IP = sc.next();
			System.out.println(IP.matches(new Line().pattern));}}}
