package com.ijinge;

import com.ijinge.Annotation.Bean;

@Bean
public class UserDaoImpl implements UserDao{
    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
