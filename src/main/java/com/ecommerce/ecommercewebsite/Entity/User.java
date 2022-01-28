package com.ecommerce.ecommercewebsite.Entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotEmpty(message = "Please Enter Email")
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Please Enter valid Email Address")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "please Enter Password")
    @NotNull
    @Size(max = 50, min = 8, message = "Password cannot be less than 8 characters nor more than 50 characters")
    @Column(name = "password")
    private String password;

}
