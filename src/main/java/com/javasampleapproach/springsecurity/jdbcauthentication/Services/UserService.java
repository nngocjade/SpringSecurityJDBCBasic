package com.javasampleapproach.springsecurity.jdbcauthentication.Services;

import com.javasampleapproach.springsecurity.jdbcauthentication.mappers.AnimalMapper;
import com.javasampleapproach.springsecurity.jdbcauthentication.mappers.UserMapper;
import com.javasampleapproach.springsecurity.jdbcauthentication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 7/24/18.
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    AnimalMapper animalMapper;



    public ArrayList<User> getUsersAndTheirAnimals() {

        ArrayList<User> users = userMapper.getUsers();

        for(User u : users){
            u.setAnimal(animalMapper.getAnimalByUsername(u.getUsername()));
        }

        return users;
    }
}
