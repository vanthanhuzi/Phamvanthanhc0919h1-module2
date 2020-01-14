package com.codegymdanag.casestudy.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {
    UserDetails loadUserByUserName(String email);
}
