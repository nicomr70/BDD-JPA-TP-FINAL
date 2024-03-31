package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;
@Getter
@Setter
@Entity
public class EcosSessionProgrammationEntity {

    @Id
    private Long id;

    private String label;

    @OneToMany(mappedBy = "ecosSessionProgrammationEntity")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationStepEntity;
}
