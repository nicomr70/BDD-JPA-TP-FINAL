package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class SkillEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private String name;
}
