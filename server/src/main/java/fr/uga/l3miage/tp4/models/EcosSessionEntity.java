package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EcosSessionEntity {
    @Id
    private Long id;
    @Column(unique = true )
    private  String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private SessionStatus status;

    @OneToMany(mappedBy = "EcosSession") // la liste des examens d'une EcosSession
    private Set<ExamEntity> exams;

}
