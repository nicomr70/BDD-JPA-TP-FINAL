package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class UserEntity {
    @Id
    private Long Id ;
    private  String firstname ;
    private String lastname ;
    @Column(unique = true , nullable = false)
    private String email ;
    @Column(unique = true)
    private String phoneNumber ;

}
