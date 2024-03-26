package fr.uga.l3miage.tp4.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcoSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;
    @OneToMany(mappedBy = "ecoSessionProgrammationEntity")
    private Set<EcoSessionProgrammationStepEntity> ecoSessionProgrammationStepEntities;
}
