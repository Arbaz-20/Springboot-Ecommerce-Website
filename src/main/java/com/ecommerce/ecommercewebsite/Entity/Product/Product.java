package com.ecommerce.ecommercewebsite.Entity.Product;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "price")
    private Long price;

    @Column(name = "Ratings")
    private int ratings;

    @Column(name = "ProductImage")
    private Byte[] productimage;

}
