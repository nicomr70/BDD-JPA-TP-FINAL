package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class SkillEntity {

    @Id
    private Long id;

    @Column(unique = true)
    private String name;


}