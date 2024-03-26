package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
