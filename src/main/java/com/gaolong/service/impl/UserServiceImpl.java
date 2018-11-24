package com.gaolong.service.impl;

import com.gaolong.dao.UserDao;
import com.gaolong.entity.User;
import com.gaolong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public boolean login(User user){
        boolean bool=false;
        User use=userDao.login(user);
        if(use!=null){
            System.out.println("use"+use);
            bool=true;
        }

        return bool;
    }
}
