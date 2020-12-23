package com.kyueun.apis.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String product_id;

    @Column
    private String product_name;

    @Column
    private String product_content;

    @Column
    private String shop_name;

    @Column
    private String category;

    @Column
    private String rocket_delivery;

    @Column
    private int evaluation_amount;

    @Column
    private float star_score;

    @Column
    private int sale;

    @Builder
    public Product(String product_id, String product_name, String product_content, String shop_name, String category,
                   String rocket_delivery, int evaluation_amount, float star_score, int sale) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.pro
    }
}
