/* Q.3 movie theatre management system. */
package Encapsulation;
class Movie {
	public String movieName; // taking variables
	public String movieStratTime;
	public String movieEndTime;
	public double movieTicketPrice;
	
	public String getMovie() { // method 1 to fetch details
		System.out.println("--Movie details--");
		System.out.println("Name of the movie : " + movieName);
		System.out.println("Movie Starting time : " + movieStratTime);
		System.out.println("Movie Ending time : " + movieEndTime);
		System.out.println("Price of the tickets : " + movieTicketPrice);
		return  movieName ;}
	//method 2 to set the details
	public void setMovie (String movieName, 
							String movieStratTime, 
							String movieEndTime, 
							double movieTicketPrice) {
		this.movieName = movieName;
		this.movieStratTime = movieStratTime;
		this.movieEndTime = movieEndTime;
		this.movieTicketPrice = movieTicketPrice;}}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie fun = new Movie(); // creating objects for class movie
		// calling methods
		fun.setMovie("Inception","12:00","14:15",325.00d); 
		fun.getMovie();}}
