package Lab8Oct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountryMap {
	
	HashMap<String, String> M1 = new HashMap<String,String>();
	HashMap<String, String> M2 = new HashMap<String,String>();
	ArrayList<String> al = new ArrayList<String>();
	
	public void storeCountryCapital(String CountryName, String Capital) {
		M1.put(CountryName,Capital);	
	}
	
	public String retrieveCapital(String CountryName) {
		return M1.get(CountryName);		
	}
	
	public HashMap reverseHash() {
		for(Entry<String, String> entry: M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	
	public String retrieveCountry(String CapitalName) {
		return M2.get(CapitalName);
	}
	
	public ArrayList iterateArrayList() {
		for(Entry<String, String> entry: M1.entrySet()) {
			al.add(entry.getKey());
		}
		return al;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CountryMap cm = new CountryMap();
		cm.storeCountryCapital("Germany", "Munich");
		cm.storeCountryCapital("Bangladesh", "Dhaka");
		cm.storeCountryCapital("Japan", "Tokyo");
		
		System.out.println(cm.reverseHash());
		System.err.println("---------------");
		
		System.out.println("Enter the name of a Country to see Capital : ");
		String CountryName = sc.next();
		System.out.println("The Capital of " + CountryName + " is :" + cm.retrieveCapital(CountryName));
		System.err.println("---------------");
		
		System.out.println("Enter the name of a Capital to see Country : ");
		String Capital = sc.next();
		System.out.println("The Country of " + Capital + " is :" + cm.retrieveCountry(Capital));
		System.err.println("---------------");
		
		System.out.println("The ArrayList with keys : " + cm.iterateArrayList());
	}
}