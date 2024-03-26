package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SkillEntity {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "skillEntities")
    private Set<ExamEntity> examEntities;
}
