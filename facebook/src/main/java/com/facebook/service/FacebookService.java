package com.facebook.service;
import com.facebook.dao.FacebookDao;
import com.facebook.dao.FacebookDaoInterface;
import com.facebook.entity.FacebookUser;

public  class FacebookService implements FacebookServiceInterface {

	@Override
	public int createProfileService(FacebookUser fu) {
		FacebookDaoInterface fd = new FacebookDao();
		int i = fd.createProfileDao(fu);
		return i;
	}


}
