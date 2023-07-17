package com.sabanciuniv.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AllData {

	@Id private String id;
	
	
	private String countryName;
	
	private String places;
	private String placesDesc;
	
	
	public String getCountryName() {
		return countryName;
	}



	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	public String getPlacesDesc() {
		return placesDesc;
	}



	public void setPlacesDesc(String placesDesc) {
		this.placesDesc = placesDesc;
	}



	private String image;
	
	
	public AllData() {
		// TODO Auto-generated constructor stub
	}

	
	
	public AllData( String countryName,String places,String placesDesc,String image) {
		super();
		
		this.countryName = countryName;
		this.places = places;
		this.placesDesc = placesDesc;
		this.image = image;
	}



	public AllData(String id,  String countryName,String places,String placesDesc,String image) {
		super();
		this.id = id;
		
		this.countryName = countryName;
		this.places = places;
		this.placesDesc = placesDesc;
		this.image = image;
	}
		





	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	


	



	


	public String getPlaces() {
		return places;
	}



	public void setPlaces(String places) {
		this.places = places;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}
	
	
}
