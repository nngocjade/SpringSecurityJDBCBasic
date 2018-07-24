package com.javasampleapproach.springsecurity.jdbcauthentication.controller;

import com.javasampleapproach.springsecurity.jdbcauthentication.Services.UserService;
import com.javasampleapproach.springsecurity.jdbcauthentication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class WebController {

    @Autowired
    UserService userService;
   
    @RequestMapping(value="/")
    public String home(){
        return "home";
    }
   
    @RequestMapping(value="/user")
    public String user(){
        return "user";
    }
  
    @RequestMapping(value="/admin")
    public String admin(Model model){

        ArrayList<User> users = userService.getUsersAndTheirAnimals();

        model.addAttribute("users", users);

        return "admin";

    }
   
    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
   
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }

    public Object getDateAndTime() {
        return null;
    }
}
