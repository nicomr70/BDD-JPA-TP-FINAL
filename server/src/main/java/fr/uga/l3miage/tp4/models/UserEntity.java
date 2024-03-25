package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//vue que c'est une classe abstraite non instanciable, pa besoin d'ajouter @Entity
@MappedSuperclass // classe abstraite
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // héritage Table_per_class
public abstract class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(unique = true, nullable = false) // attribut (email) unique et non nul
    private String email;
    @Column(nullable = false, unique = true)
    @Size(min = 8, max = 8)
    @Pattern(regexp = "[0-9]+", message = "Le numéro de téléphone doit être composé de 8 chiffres")
    private String phoneNumber;

}