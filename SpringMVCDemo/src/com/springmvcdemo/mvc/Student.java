package com.springmvcdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favLang;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("US", "United States of America");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");	
		
		
		// populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
	        return favoriteLanguageOptions;
	}
	
	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

}
