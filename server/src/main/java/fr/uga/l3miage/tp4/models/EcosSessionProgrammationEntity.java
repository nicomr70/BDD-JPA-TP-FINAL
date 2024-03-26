package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;

   @OneToMany(mappedBy = "EcosSessionProgrammation")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationStepEntities;
}