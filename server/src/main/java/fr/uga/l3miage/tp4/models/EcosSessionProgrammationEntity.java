package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;

    @OneToOne
    @JoinColumn(name = "session_id")
    private EcosSessionEntity session;

    @OneToMany(mappedBy = "programmation")
    private List<EcosSessionProgrammationStepEntity> steps;
	


    // Constructors, getters, and setters
}
