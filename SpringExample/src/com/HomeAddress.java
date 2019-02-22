package com;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Repository;


@Repository
public class HomeAddress implements Address {
	private String streetNo="4";
	@Value("${city}")
	private String city;
	
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	@Required
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public void printAddress() {
		System.out.println("Street No="+streetNo);
		System.out.println("City="+city);
		
	}

}
