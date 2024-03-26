package fr.uga.l3miage.tp4.models;
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
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;

    private String label;

    @OneToMany(mappedBy = "ecosSessionProgrammation")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationSteps;
}
