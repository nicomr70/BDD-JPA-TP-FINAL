package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@MappedSuperclass   // Permet de donner l’indication que la classe mère ne peut jamais être concrète
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserEntity {
    @Id
    private Long id;

    private String firstname;

    private String lastname;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true)
    private String phoneNumber;
}
