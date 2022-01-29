package com.ecommerce.ecommercewebsite.Services.ProductService;

import com.ecommerce.ecommercewebsite.DAO.ProductRepository;
import com.ecommerce.ecommercewebsite.Entity.Product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        List<Product> products =productRepository.getAllProduct();
        return products;
    }

    public Product getProductById(int id){
        Product product = productRepository.getProductById(id);
        return product;
    }

    public Product UpdateProduct(Product product,int id){
        Product product1 = productRepository.updateProduct(product,id);
        return product1;
    }

    public void deleteProductById(int id) {
        productRepository.deleteProductById(id);
    }
}
