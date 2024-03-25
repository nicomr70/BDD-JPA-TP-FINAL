package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import fr.uga.l3miage.tp4.enums.SessionStatus;

@Entity
public class EcosSessionEntity {
	@Id
	private Long id;

	@Column(unique = true)
	private String name;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private int weight;

	private SessionStatus status;

	@OneToMany(mappedBy = "session")
	private Set<ExamEntity> exams;

	@OneToOne(mappedBy = "session")
	private EcosSessionProgrammationEntity programmation;

}
