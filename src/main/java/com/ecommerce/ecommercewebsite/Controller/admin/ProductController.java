package com.ecommerce.ecommercewebsite.Controller.admin;

import com.ecommerce.ecommercewebsite.Entity.Product.Product;
import com.ecommerce.ecommercewebsite.Services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private UserService userService;


}
