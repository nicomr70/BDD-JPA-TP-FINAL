package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

import fr.uga.l3miage.tp4.enums.SessionStatus;

@Entity
public class EcosSessionEntity {
	@Id
	private Long id;

	@Column(unique = true)
	private String name;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	@Enumerated(EnumType.ORDINAL)
	private SessionStatus status;

	@OneToMany(mappedBy = "session")
	private Set<ExamEntity> exams;

	@OneToOne
	@JoinColumn(name = "id_eco_session", referencedColumnName = "id")
	private EcosSessionProgrammationEntity programmation;

}
