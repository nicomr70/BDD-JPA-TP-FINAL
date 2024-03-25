package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class EcosSessionProgrammationStepEntity {
	@Id
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String code;
	
	private final LocalDateTime dateTime; 
	
	@Column(nullable = false)
	private String description;

	@ManyToOne
	@JoinColumn(name = "programmation_id")
	private EcosSessionProgrammationEntity programmation;

}
