package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SkillEntity {
    @Id
    private long id;
    @Id
    @Column(unique = true)
    private  String name;

}
