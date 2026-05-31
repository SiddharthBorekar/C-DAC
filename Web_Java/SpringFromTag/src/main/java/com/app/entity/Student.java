package com.app.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {
	public String FirsstName;
	public String LastName;
	public String Country;
	
	private Map<String,String> CountryOptions;
	private String FavoriteLanguage;
	private String[] OperatingSystems;
	
	public Student() {
		CountryOptions = new HashMap<String, String>();
		CountryOptions.put("IN","India");
		CountryOptions.put("UK","United-Kingdom");
		CountryOptions.put("FR","France");
		CountryOptions.put("BR","Brazil");
		CountryOptions.put("DE","Germany");
	}

	public String getFirsstName() {
		return FirsstName;
	}

	public void setFirsstName(String firsstName) {
		FirsstName = firsstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Map<String, String> getCountryOptions() {
		return CountryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		CountryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return FavoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		FavoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return OperatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		OperatingSystems = operatingSystems;
	}

	@Override
	public String toString() {
		return "Student [FirsstName=" + FirsstName + ", LastName=" + LastName + ", Country=" + Country
				+ ", CountryOptions=" + CountryOptions + ", FavoriteLanguage=" + FavoriteLanguage
				+ ", OperatingSystems=" + Arrays.toString(OperatingSystems) + "]";
	}
	
}
