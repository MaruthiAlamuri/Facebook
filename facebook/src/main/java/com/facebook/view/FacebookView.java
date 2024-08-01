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
	    
	    int c=sc.nextInt();
	    FacebookControllerInterface fc = new FacebookController();
	    String s="y";
	    while(s.equals(s)) {
	    switch (c){
	    	case 1: fc.createProfileController();
	    		break;
	    	case 2:fc.viewProfileController();
	    		break;
	    	case 3:fc.deleteProfileController();
	    		break;
	        case 4:fc.editProfileController();
    		    break;
	        case 5:fc.serachProfileController();
    		   break;
	        case 6:fc.viewAllProfileController();
    		   break;
	        case 7:fc.loginProfileController();
    		    break;
	        default:
	        	System.out.println("Wrong Choice");
	    }
	    System.out.println("You Want another choice");
	    s=sc.next();
	  }
	}

}
