package fr.uga.l3miage.tp4.modules;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SkillEntity {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;
}
