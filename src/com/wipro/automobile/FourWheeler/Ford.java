package com.wipro.automobile.FourWheeler;

import com.wipro.automobile.Vehicle;

public class Ford extends Vehicle {
	protected int tempC;
	public Ford(String mname,String rnum,String oname,int sp,int tempC){
		super(mname,rnum,oname,sp);
		this.tempC=tempC;
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

	public int tempControl() {
		return tempC;
		
	}
}
