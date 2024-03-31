package fr.uga.l3miage.tp4.models;

import java.util.Set;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EcosSessionProgrammationEntity {
    @Id
    private long id;
    private String label;

    @OneToMany(mappedBy = "ecosSessionProgrammationEntities")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationStepEntities;
}
