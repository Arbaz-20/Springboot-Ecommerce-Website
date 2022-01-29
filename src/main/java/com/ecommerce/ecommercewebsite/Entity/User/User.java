package com.ecommerce.ecommercewebsite.Entity.User;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

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
    @NotBlank(message = "Please Enter Email")
    @Email(regexp = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$", message = "Please Enter valid Email Address")
    @Column(name = "email")
    private String email;

    @NotNull
    @NotEmpty(message = "please Enter Password")
    @NotBlank(message = "please Enter Password")
    @Size(min = 8, message = "Password cannot be less than 8 characters")
    @Column(name = "password")
    private String password;

}
