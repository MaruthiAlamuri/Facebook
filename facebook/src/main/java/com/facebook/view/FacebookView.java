package com.facebook.view;
import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
		System.out.println("********MAIN MENU*********");
		System.out.println("prees 1 to create profile");
		System.out.println("prees 2 to view profile");
		System.out.println("prees 3 to delete profile");
		System.out.println("prees 4 to edit profile");
		System.out.println("prees 5 to serach profile");
		System.out.println("prees 6 to view all profile");
		System.out.println("prees 7 to login profile");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Your Choice");
	    
	    int ch=sc.nextInt();
	    
	    FacebookControllerInterface fc = new FacebookController();
	    Switch
	}

}
