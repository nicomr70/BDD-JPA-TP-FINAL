package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //creer 2 table
public class UserEntity {
    @Id //@GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String firstname;
    private String lastname;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, length = 8)
    private String phoneNumber;
}
