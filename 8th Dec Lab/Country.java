package Lab8Dec;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Country {

HashSet<String> H1 = new HashSet<>();
	
	
	public void storeCountryNames(String CountryName) {
		H1.add(CountryName);	
	}
	

	public String retrieveCountry(String CountryName) {
		for (String s : H1) {
			if(H1.contains(CountryName)) {	
			return CountryName;}
			else {return null;}
		}
		return null;						
	}
	
	public static void main(String[] args) {
		Country cn = new Country();
		cn.storeCountryNames("India");
		cn.storeCountryNames("Japan");
		cn.storeCountryNames("Germany");
		
		System.out.println(cn.retrieveCountry("Japan"));
		System.out.println(cn.retrieveCountry("China"));
	}

}
