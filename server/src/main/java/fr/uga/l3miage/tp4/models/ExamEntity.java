package fr.uga.l3miage.tp4.models;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Column(unique = true)
    private String name;

    private Integer weight;

    @ManyToMany
    private Set<SkillEntity> skills;
}
