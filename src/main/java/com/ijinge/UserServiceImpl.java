package com.ijinge;

import com.ijinge.Annotation.Bean;
import com.ijinge.Annotation.DI;

@Bean
public class UserServiceImpl implements UserService{
    @DI
    private UserDao userDao;
    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
