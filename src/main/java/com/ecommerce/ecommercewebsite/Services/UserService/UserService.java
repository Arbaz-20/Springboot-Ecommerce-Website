package com.ecommerce.ecommercewebsite.Services.UserService;

import java.util.List;
import com.ecommerce.ecommercewebsite.DAO.UserRepository;
import com.ecommerce.ecommercewebsite.Entity.User.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return (List<User>) userRepository.saveAll(users);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.getAllUsers();
    }

    public User getUserByEmailId(String email) {
        return userRepository.findUserByEmail(email);
    }

    public User getUserByUserId(int id) {
        return userRepository.getUserByUserId(id);
    }

    public User deleteUserById(int id){
        return userRepository.deleteUserById(id);
    }
}
