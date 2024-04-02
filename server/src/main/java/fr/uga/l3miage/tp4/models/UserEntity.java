package fr.uga.l3miage.tp4.models;

import io.micrometer.core.lang.Nullable;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class UserEntity {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(unique = true)
    private String phoneNumber;

}
