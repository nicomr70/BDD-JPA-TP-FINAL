package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstname;
    private String lastname;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true)
    private String phoneNumber;



}
