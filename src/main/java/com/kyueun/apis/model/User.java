package com.kyueun.apis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;

    @Column
    private String user_name;

    @Column
    private String phone_number;

    @Column
    private String user_grade;

    @Override
    public String toString() {
        return String.format(
                "User[user_id='%s', user_name='%s', phone_number='%s', user_grade='%s']",
                this.user_id, this.user_name, this.phone_number, this.user_grade
        );
    }
}
