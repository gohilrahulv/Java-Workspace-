package com.userprofile.service;


import com.userprofile.dao.UserDao;
import com.userprofile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void registerUser(User user) {
        userDao.saveUser(user);
    }

    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    // Other service methods
}
