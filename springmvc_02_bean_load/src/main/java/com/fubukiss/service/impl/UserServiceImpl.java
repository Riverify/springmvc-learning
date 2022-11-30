package com.fubukiss.service.impl;

import com.fubukiss.domain.User;
import com.fubukiss.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service ...");
    }
}
