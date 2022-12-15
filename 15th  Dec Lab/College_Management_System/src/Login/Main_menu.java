package Login;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import Registration.ToRegister;
import Profile.Details;
import Admission.Criteria;
public class Main_menu {
	
	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Register :--");
		System.out.println("Press 2 to log in :--");
		
		int choice1 = sc.nextInt();
		
		if(choice1 == 1) {
			Random random = new Random();
			long sid = random.nextLong(9999999999l);
			System.out.println("Your id is generated : "+ sid);
			System.out.println("Enter your would be password : ");
			String password = sc.next();
			while(!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%*?&])[A-Za-z\\d@#$!%*?&]{6}$", String.valueOf(password))){
				System.err.println("--WEAK PASSWORD--");
				System.out.println("Enter password again");
				password = sc.next();}
			ToRegister.generate(sid,password);
		}
		else if(choice1 == 2) {
			System.out.println("Enter your Id and Password :");
			long sid = sc.nextLong();
			String password = sc.next();
			Details.show(sid,password);
			Criteria.check(sid,password);
		}
	}
}
