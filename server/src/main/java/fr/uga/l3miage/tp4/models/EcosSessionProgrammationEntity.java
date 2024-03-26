package fr.uga.l3miage.tp4.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;

    private String label;

    @OneToMany(mappedBy = "ecoSessionProgrammationEntity")
    private Set<EcosSessionProgrammationStepEntity> ecoSessionProgrammationStepEntities;
}