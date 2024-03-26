package fr.uga.l3miage.tp4.modules;


import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    @OneToMany(mappedBy = "ecosSessionEntity")
    private Set<ExamEntity> exams;

    @OneToOne
    @JoinColumn(name = "ecosession_id")
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;
}
