package com.wpro.sets;
import java.util.*;

public class Country1 {
	Set<String>s1= new TreeSet<>();
	public Set<String> 	saveCountryNames(String CountryName){
		s1.add(CountryName);
		return s1;
	}
	public String getCountry (String CountryName) {
		Iterator<String> i = s1.iterator();
		while (i.hasNext()) {
			if (i.next().equals(CountryName)) {
				return CountryName;
			}
			
		}
		return null;
	}
}
