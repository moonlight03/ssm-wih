package com.example.controller;
 
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */
 
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
    @GetMapping("/getUserById")
    public User getUserById(@RequestParam(value = "id") String id,
                            @RequestParam(value = "pass") String pass){
        System.out.println(id);
        return userService.getUserById(Integer.parseInt(id),pass);
    }
    @GetMapping("/sgetUserById")
    public User getUserById(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println(id);
        return userService.getUserById(Integer.parseInt(id),"123456");
    }
}