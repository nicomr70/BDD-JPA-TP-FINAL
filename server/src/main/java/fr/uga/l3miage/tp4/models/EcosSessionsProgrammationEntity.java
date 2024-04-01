package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class EcosSessionsProgrammationEntity {
    @Id
    Long id ;
    String label ;
    @OneToOne(mappedBy = "ecosSessionsProgrammation")
    private EcosSessionEntity ecosSession ;
    @OneToMany(mappedBy = "ecosSessionsProgrammation")
    private Set<EcosSessionsProgrammationStepEntity> ecosSessionsProgrammationSteps ;



}
