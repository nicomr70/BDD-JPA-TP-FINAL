package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

//tout en mode createdrop pay attention mona
@Entity
public class ExamEntity {
    @Id
    private long id;
    @Column(name="start_date") private LocalDateTime startDate;
    @Column(name="end_date") private LocalDateTime endDate;
    @Column(unique = true) private String name;

    @ManyToOne()
    private EcosSessionEntity ecosSessionEntity;

    @ManyToMany(mappedBy = "examEntities")
    private Set<SkillEntity> skillEntities;

}
