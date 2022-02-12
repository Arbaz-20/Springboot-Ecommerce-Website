package com.ecommerce.ecommercewebsite.Controller.Login;

import java.util.List;
import javax.validation.Valid;
import com.ecommerce.ecommercewebsite.Entity.User.User;
import com.ecommerce.ecommercewebsite.Services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userservice;

    @PostMapping("/signup")
    public String Signup(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("error", "Please fill the details Properly");
            return "home";
        } else {
            userservice.saveUser(user);
        }
        model.addAttribute("status","You have successfully Signed up Please login in order to proceed...");
        return "home";
    }

    @GetMapping("/login")
    public String Login(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "home";
        } else {
            List<User> users = userservice.getAllUsers();
            if(!users.contains(user) ){
                model.addAttribute("error","Email Doesn't Exists");
                return "home";
            }
        }
        return "home";
    }

}
