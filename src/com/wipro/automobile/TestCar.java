package com.wipro.automobile;
import com.wipro.automobile.FourWheeler.*;
public class TestCar {

	public static void main(String[] args) {
		Logan l1=new Logan("Mahindra Logan" , "ML2634CSF3647", "Rohit Verma", 140, 1);
		System.out.println("The model name is "+l1.getModelName());
		System.out.println("The registration number is "+l1.getRegistrationNumber());
		System.out.println("The owner's name is "+l1.getOwnerName());
		System.out.println("The current speed of "+l1.getModelName()+" is "+l1.getSpeed()+" kmph.");
		System.out.println("Has facility to control GPS :"+l1.gps());
		
		System.out.println();
		
		Ford f1=new Ford("Ford Figo","FC2594CHG3827","Vikas",125,1);
		System.out.println("The model name is "+f1.getModelName());
		System.out.println("The registration number is "+f1.getRegistrationNumber());
		System.out.println("The owner's name is "+f1.getOwnerName());
		System.out.println("The current speed of "+f1.getModelName()+" is "+f1.getSpeed()+" kmph.");
		System.out.println("Has temperature control facility :"+f1.tempControl());

	}

}
