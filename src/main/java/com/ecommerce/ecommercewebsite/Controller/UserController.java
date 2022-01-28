package com.ecommerce.ecommercewebsite.Controller;

import java.util.List;
import javax.validation.Valid;
import com.ecommerce.ecommercewebsite.Entity.User;
import com.ecommerce.ecommercewebsite.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/signup")
    public String Signup(@Valid @ModelAttribute User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "home";
        } else {
            userservice.saveUser(user);
        }
        return "index";
    }

    @GetMapping("/login")
    public String Login(@Valid @ModelAttribute User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "home";
        } else {
            List<User> users = userservice.getallUsers();

        }
        return "index";
    }

}
