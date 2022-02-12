package com.ecommerce.ecommercewebsite.Controller.admin;

import com.ecommerce.ecommercewebsite.Entity.User.User;
import com.ecommerce.ecommercewebsite.Services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id")int id){
        User user = userService.getUserByUserId(id);
        return user;
    }

    @GetMapping("/user/{email}")
    public User getUserByEmailId(@PathVariable("email") String email){
        User emailId = userService.getUserByEmailId(email);
        return emailId;
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.deleteUserById(id);
        return "User deleted Successfully";
    }
}
