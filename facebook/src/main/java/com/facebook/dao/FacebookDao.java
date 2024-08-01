package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public class FacebookDao implements FacebookDaoInterface {
    private static FacebookUser fuser[];
    static {
    	fuser=new FacebookUser[10];
    }
	@Override
	public int createProfileDao(FacebookUser fu) {
		for(int i=0;i<fuser.length;i++) {
			if(fuser==null) {
				fuser[i]=fu;
		        break;
			}
		}
		if(fuser.length>0)
		return 1;
		else
			return 0;
	}

}
