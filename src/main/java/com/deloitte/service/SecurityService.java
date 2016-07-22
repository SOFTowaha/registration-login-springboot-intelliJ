package com.deloitte.service;

/**
 * Created by barsingh on 7/20/2016.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);
}
