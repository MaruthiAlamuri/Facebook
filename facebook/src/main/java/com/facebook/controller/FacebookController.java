package com.facebook.controller;
import java.util.Scanner;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String Name =sc.next();
		
		System.out.println("Enter Password");
		String Password = sc.next();
		
		System.out.println("Enter Email");
		String Email = sc.next();
		
		System.out.println("Enter Address");
		String Address = sc.next();
		
		FacebookUser fu =  new FacebookUser();
		fu.setName(Name);
		fu.setPassword(Password);
		fu.setEmail(Email);
		fu.setAddress(Address);
		
		
		FacebookServiceInterface fs = new FacebookService();
		int i=fs.createProfileService(fu);
		if(i>0) {
			System.out.println("Create is Created");
		}
		else {
			System.out.println("Profile rejected");
		}
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serachProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
	}

}
