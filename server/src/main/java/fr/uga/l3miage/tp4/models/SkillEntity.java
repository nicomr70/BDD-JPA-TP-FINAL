package fr.uga.l3miage.tp4.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SkillEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private String name;

}
