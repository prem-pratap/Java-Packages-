package com.wipro.automobile.FourWheeler;

import com.wipro.automobile.Vehicle;

public class Logan extends Vehicle {
	protected int gps; 
	public Logan(String mname,String rnum,String oname,int sp,int gps){
		super(mname,rnum,oname,sp);
		this.gps=gps;
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
	
	public int gps() {
		return gps;
	}

}
