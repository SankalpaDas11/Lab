package Lab8Oct;

import java.util.ArrayList;	// importing ArrayList
import java.util.HashMap;	// importing Hashmap
import java.util.Map.Entry;	// importing Entry
import java.util.Scanner;	// importing Scanner

public class CountryMap {
	
	HashMap<String, String> M1 = new HashMap<String,String>();	// creating 1st hash-map named M1 
	HashMap<String, String> M2 = new HashMap<String,String>();	// creating 2nd hash-map named M2 
	ArrayList<String> al = new ArrayList<String>();			// creating an Array-List named al
	
	public void storeCountryCapital(String CountryName, String Capital) {	// 1st method to insert countries and capital in M1 by put method
		M1.put(CountryName,Capital);	
	}
	
	public String retrieveCapital(String CountryName) {			// 2nd method to fetch capital by giving country name
		return M1.get(CountryName);		
	}
	
	public HashMap reverseHash() {						// 3rd method to iterate M1 and reversely storing the values in M2
		for(Entry<String, String> entry: M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());		// logic of reversing
		}
		return M2;							// returning M2 for confirmation
	}
	
	public String retrieveCountry(String CapitalName) {			// 4th method to fetch Country by giving capital name 
		return M2.get(CapitalName);
	}
	
	public ArrayList iterateArrayList() {					// 5th method to iterate M1 and storing keys in ArrayList al
		for(Entry<String, String> entry: M1.entrySet()) {
			al.add(entry.getKey());
		}
		return al;							// returning al for confirmation
	}
	
	public static void main(String[] args) {				// main method
		Scanner sc = new Scanner(System.in);				// Scanner class object
		CountryMap cm = new CountryMap();				// object of countrymap class
		
		cm.storeCountryCapital("Germany", "Munich");			// Calling 1st method by passing country and capital names
		cm.storeCountryCapital("Bangladesh", "Dhaka");
		cm.storeCountryCapital("Japan", "Tokyo");
		
		System.out.println(cm.reverseHash());				// calling 2nd method
		System.err.println("---------------");
		
		System.out.println("Enter the name of a Country to see Capital : ");					// Asking country name to fetch capital
		String CountryName = sc.next();										// storing user input
		System.out.println("The Capital of " + CountryName + " is :" + cm.retrieveCapital(CountryName));	// 3rd method, passing user input
		System.err.println("---------------");
		
		System.out.println("Enter the name of a Capital to see Country : ");					// Asking capital name to fetch country
		String Capital = sc.next();										// storing user input
		System.out.println("The Country of " + Capital + " is :" + cm.retrieveCountry(Capital));		// calling 4th method, passing user input
		System.err.println("---------------");
		
		System.out.println("The ArrayList with keys : " + cm.iterateArrayList());				// ccalling 5th method to get ArrayList
	}
}
