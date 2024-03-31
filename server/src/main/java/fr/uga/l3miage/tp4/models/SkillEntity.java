package fr.uga.l3miage.tp4.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SkillEntity {
    @Id
    private long id;
    @Id
    @Column(unique = true)
    private  String name;

    @ManyToMany
    private Set<ExamEntity> examEntities;
}
