package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public abstract class UserEntity {

    @Id
    private Long id;
    private String firstname;
    private String lastname;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true)
    private String phoneNumber;

}
