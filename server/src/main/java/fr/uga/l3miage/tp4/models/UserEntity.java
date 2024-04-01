package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class   UserEntity {
    @Id
    Long id;
    String firstName;
    String lastName;
    @Column(unique = true,nullable = false)
    String email;
    @Column(unique = true)
    String phoneNumber;




}
