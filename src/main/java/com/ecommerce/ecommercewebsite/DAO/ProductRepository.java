package com.ecommerce.ecommercewebsite.DAO;

import com.ecommerce.ecommercewebsite.Entity.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select * from product",nativeQuery = true)
    public List<Product> getAllProduct();

    @Query(value = "select * from product where id=?",nativeQuery = true)
    public Product getProductById(int id);

    @Query(value = "delete product where id=?",nativeQuery = true)
    public Product deleteProductById(int id);

    @Query(value = "delete * from product")
    public List<Product> deleteAllProducts();

    @Query(value = "Update product set product=? where id=?",nativeQuery = true)
    public  Product updateProduct(Product product,int id);
}
