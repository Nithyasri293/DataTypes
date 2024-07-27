package com.line;

import org.openqa.selenium.WebElement;
import org.tests.Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StudentInfo {
	public static void main(String[] args) {
		String name="Nithyasri.B";
				System.out.println("Name:"+name);
		byte age=21;
		        System.out.println("Age:"+age);
		char gender='F';
		       System.out.println("Gender:"+gender);
		String Email="nithya29bns@gmail.com";
		       System.out.println("Email:"+Email);
		Long aadhaarNumber=243567899876l;
		       System.out.println("Aadhaar Number:"+aadhaarNumber);
		short registerNo=4224;
				System.out.println("Register Number:"+registerNo);
		float height=162.5f;
				System.out.println("Height:"+height);
		double weight=42.3;
				System.out.println("Weight:"+weight);
	    int phnNo=994232770;
	            System.out.println("PhoneNumber:"+phnNo);
	    float cgpa=8.9f;
	            System.out.println("CGPA:"+cgpa);
	    boolean result=true;
	            System.out.println("Result:"+result);
	
	}

	@When("User clicks the i am not a robot button")
	public void user_clicks_the_i_am_not_a_robot_button() {
		/*Pojo p=new Pojo();
		WebElement robot = p.getRobot();
		   robot.click();*/
	}

}
