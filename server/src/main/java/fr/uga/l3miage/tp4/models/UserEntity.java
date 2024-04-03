package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserEntity {
    @Id
    Long id;
    String firstname;
    String lastname;
    @Column(unique = true, nullable = false)
    String email;
    @Column(unique = true, length = 8)
    String phoneNumber;
}
