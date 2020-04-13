package com.wipro.automobile;

public abstract class Vehicle {
	protected String ModelName;
	protected String RegistrationNumber;
	protected String OwnerName;
	protected int speed;
	
	protected Vehicle(String mname,String rnum,String oname,int sp) {
		this.ModelName=mname;
		this.RegistrationNumber=rnum;
		this.OwnerName=oname;
		this.speed=sp;
	}
	abstract public String getModelName();
	abstract public String getRegistrationNumber();
	abstract public String getOwnerName();
	abstract public int getSpeed();
	
}
