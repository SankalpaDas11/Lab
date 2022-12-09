package Lab8Dec;

import java.util.HashSet; 			// importing hash-set
import java.util.LinkedHashSet;
import java.util.Set;

public class Country {

HashSet<String> H1 = new HashSet<>();		// creating a new has set named H1
	
	
	public void storeCountryNames(String CountryName) { 	// 1st method to add country named in H1
		H1.add(CountryName);	
	}
	

	public String retrieveCountry(String CountryName) { 	// 2nd method to retrieve the country names from H1
		for (String s : H1) {
			if(H1.contains(CountryName)) { 		// checking if the given ccountry name exists in H1 
			return CountryName;}
			else {return null;}			// else returning null 
		}
		return null;						
	}
	
	public static void main(String[] args) { 			// main method
		Country cn = new Country();				// ccreating object of the country class
		cn.storeCountryNames("India"); 				// inserting values by calling the 1st method by passing country names
		cn.storeCountryNames("Japan");
		cn.storeCountryNames("Germany");
		
		System.out.println(cn.retrieveCountry("Japan")); 	// checking and returning country names if exists 
		System.out.println(cn.retrieveCountry("China"));
	}

}
