package com.wipro.automobile;

import com.wipro.automobile.Vehicle;

public class Honda extends Vehicle {
	public Honda(String mname,String rnum,String oname,int sp){
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
	public void cdplayer() {
		System.out.println("provides facility to control the cd player device which is available in the car");
	}
	

}
