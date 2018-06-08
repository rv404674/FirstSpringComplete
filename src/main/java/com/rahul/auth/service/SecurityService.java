//to provide current logged in user and auto login user after registering and account.

package com.rahul.auth.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
