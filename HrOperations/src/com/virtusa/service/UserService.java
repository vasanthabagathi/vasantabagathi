package com.virtusa.service;

import java.io.IOException;

import com.virtusa.model.UserModel;

public interface UserService {
    
	public String userAuthenticationService(UserModel userModel) throws IOException;
}
