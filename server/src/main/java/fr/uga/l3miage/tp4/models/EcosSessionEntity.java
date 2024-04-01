package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

import fr.uga.l3miage.tp4.enums.SessionStatus;

@Entity
public class EcosSessionEntity {
    @Id
    Long id ;
    @Column(unique = true)
    String name ;
    LocalDateTime startDate;
    LocalDateTime endDate;
    SessionStatus status ;
    @OneToMany(mappedBy = "ecosSession")
    private Set<ExamEntity> exams ;
    @OneToOne
    private EcosSessionsProgrammationEntity ecosSessionsProgrammation;

}
