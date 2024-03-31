package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SkillEntity {

    @Id
    private Long id;


    @Column(unique = true)
    private String name;


}
