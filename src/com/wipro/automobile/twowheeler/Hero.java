package com.wipro.automobile.twowheeler;

import com.wipro.automobile.Vehicle;


public class Hero extends Vehicle {
	
	
	public Hero(String mname,String rnum,String oname,int sp){
		super(mname,rnum,oname,sp);
	}
	public String getModelName() {
		return ModelName;
	}

	@Override
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}

	@Override
	public String getOwnerName() {
		return OwnerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void radio() {
		System.out.println("provides facility to control the radio device");
	}
	

}
