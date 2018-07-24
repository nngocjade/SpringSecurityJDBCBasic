package com.javasampleapproach.springsecurity.jdbcauthentication.mappers;

import com.javasampleapproach.springsecurity.jdbcauthentication.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 7/24/18.
 */

@Mapper
public interface UserMapper {

    public String GET_USERS = "SELECT * FROM users";

    @Select(GET_USERS)
    public ArrayList<User> getUsers();

}
