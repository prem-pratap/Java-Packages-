package com.wipro.automobile;
import com.wipro.automobile.twowheeler.Hero;
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Passion Pro","HRB3673XT74","Sushant", 85);
		System.out.println("The model name is "+hero.getModelName());
		System.out.println("The owner's name is "+hero.getOwnerName());
		System.out.println("The registration number is "+hero.getRegistrationNumber());
		System.out.println("The current speed of "+hero.getModelName()+" is "+hero.getSpeed());
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "HNC394849CV", "Ajay Singh", 110);
		System.out.println("The model name is "+honda.getModelName());
		System.out.println("The owner's name is "+honda.getOwnerName());
		System.out.println("The registration number is "+honda.getRegistrationNumber());
		System.out.println("The current speed of "+honda.getModelName()+" is "+honda.getSpeed());
		honda.cdplayer();
	}

}
