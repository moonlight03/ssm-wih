package com.example.controller;
 
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User getUserById(@RequestParam(value = "id") String id,
                            @RequestParam(value = "pass") String pass, HttpServletResponse res){
        User user = userService.getUserById(Integer.parseInt(id), pass);
        return user;
    }
}