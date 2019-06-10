package com.example.controller;
 
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        System.out.println();

        return userService.Sel(id).toString();
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User getUserById(@RequestParam(value = "id") String id,
                            @RequestParam(value = "pass") String pass){

        return userService.getUserById(Integer.parseInt(id),pass);
    }
}