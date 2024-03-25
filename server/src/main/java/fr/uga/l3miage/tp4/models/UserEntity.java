package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserEntity {

    @Id
    private long id;

    private String firstname;

    private String lastname;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(unique = true)
    private String phoneNumber;






}
