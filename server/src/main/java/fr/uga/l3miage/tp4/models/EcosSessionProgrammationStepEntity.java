package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class EcosSessionProgrammationStepEntity {
	@Id
	private Long id;

	@Column(updatable = false)
	private LocalDateTime dateTime;

	@Column(unique = true)
	private String code;

	@Column(nullable = false)
	private String description;

//	@ManyToOne
//	private EcosSessionProgrammationEntity programmation;

}
