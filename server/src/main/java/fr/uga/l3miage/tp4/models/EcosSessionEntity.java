package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcosSessionEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private SessionStatus status;

    @OneToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammation;

    @OneToMany(mappedBy = "ecosSession")
    private Set<ExamEntity> exams;
}
