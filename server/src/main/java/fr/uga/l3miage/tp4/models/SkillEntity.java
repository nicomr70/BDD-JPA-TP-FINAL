package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
public class SkillEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name", unique=true)
    private String name;
}
