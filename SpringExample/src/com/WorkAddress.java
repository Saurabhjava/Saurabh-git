package com;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class WorkAddress implements Address {
	private String compantName="Yamaha";
	private String city="Faridabad";
	
	public String getCompantName() {
		return compantName;
	}

	public void setCompantName(String compantName) {
		this.compantName = compantName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void printAddress() {
		System.out.println("CompanyName="+compantName);
		System.out.println("City="+city);
		
	}

}
