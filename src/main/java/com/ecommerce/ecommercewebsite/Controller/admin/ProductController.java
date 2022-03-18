package com.ecommerce.ecommercewebsite.Controller.admin;

import com.ecommerce.ecommercewebsite.Entity.Product.Product;
import com.ecommerce.ecommercewebsite.Services.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public String AddProduct(@Valid @ModelAttribute("product") Product product,BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("error",result);
            return "dashboard";
        }
        productService.saveProduct(product);
        model.addAttribute("success","Product Added Successfully");
        return "dashboard";
    }

    @PutMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable("id") int id , Product product,Model model){
        productService.UpdateProduct(product,id);
        model.addAttribute("success","Product Updated Successfully");
        return"dashboard";
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int id){
            Product product = productService.getProductById(id);
            return product;
    }

    @GetMapping("/product")
    public List<Product> getAllProducts(Model model){
        List<Product> products = productService.getAllProducts();
        return products;
    }

    @DeleteMapping("deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id,Model model){
        productService.deleteProductById(id);
        model.addAttribute("success","Product Deleted Successfully");
        return"dashboard";
    }
}
