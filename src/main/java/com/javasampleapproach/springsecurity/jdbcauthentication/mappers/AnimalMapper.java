package com.javasampleapproach.springsecurity.jdbcauthentication.mappers;

import com.javasampleapproach.springsecurity.jdbcauthentication.model.Animal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 7/24/18.
 */

@Mapper
public interface AnimalMapper {

    String GET_ANIMALS = "SELECT * FROM animals";

    String GET_ANIMAL_BY_USER = "select a.species, a.isPet " +
            "from animal a " +
            "join user_animals ua " +
            "on a.id = ua.animal_id " +
            "join users u " +
            "on ua.user_name = u.username " +
            "where u.username = #{username}";

    @Select(GET_ANIMALS)
    public ArrayList<Animal> getAllAnimals();

    @Select(GET_ANIMAL_BY_USER)
    public Animal getAnimalByUsername(String username);



}
