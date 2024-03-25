package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;

    @OneToMany(mappedBy = "sessionProgrammation")
    private List<EcosSessionProgrammationStepEntity> steps;
}