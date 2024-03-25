package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserEntity {
    @Id
    private Long id;

    private String firtName;

    private  String lastName;

    @Column(nullable = false, unique = true)
    private  String email;

    @Column(unique = true, length = 8)
    private String phoneNumber;
}
