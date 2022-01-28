package com.ecommerce.ecommercewebsite.DAO;

import java.util.List;

import com.ecommerce.ecommercewebsite.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "Select * from users", nativeQuery = true)
    public List<User> getallusers();

    @Query(value = "select * from users where id=?", nativeQuery = true)
    public User getUserByUserId(@PathVariable("") int id);

    @Query(value = "select * from users where email=?", nativeQuery = true)
    public User findUserByEmail(@PathVariable("") String email);

}
