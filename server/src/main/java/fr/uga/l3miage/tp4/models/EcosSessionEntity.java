package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {
    @Id
    private Long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private SessionStatus status;

    @OneToOne
    @JoinColumn(name = "id_ecoProg", referencedColumnName = "id")
    private EcosSessionProgrammationEntity ecosSessionProgrammation;

    @OneToMany(mappedBy = "exam")
    @JoinColumn(name = "id_exam", referencedColumnName = "id")
    private Set<ExamEntity> exams;

}