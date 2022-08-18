// Q.2 Write  java program to convert minutes into a number of years and days. 
public class Minutes {
	public static void main(String[] args) {
		double minutesInYear = 60 * 24 * 365; // total minutes in a year
		double min = 3456789; // initializing given number of minutes
		long years = (long) (min / minutesInYear); // converting in years 
		int days = (int) (min / 60 / 24) % 365; // converting the remaining minutes into days 
		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days"); //printing the converted result
	}
}
