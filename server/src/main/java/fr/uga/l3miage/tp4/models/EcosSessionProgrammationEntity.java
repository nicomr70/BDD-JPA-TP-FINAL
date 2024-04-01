package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id ;
    private String label ;

    @OneToMany(mappedBy = "ecosSessionPogrammation")
    @JoinColumn(name = "id_ecoStep" , referencedColumnName = "id")
    private Set <EcosSessionPogrammationStepEntity> ecosSessionPogrammationStep ;
}
