package fr.uga.l3miage.tp4.models;


import lombok.*;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "ecoSessionProgrammationEntity",cascade = CascadeType.ALL)
    private Set<EcoSessionProgrammationStepEntity> aPourEtapes;

    @OneToOne
    private EcoSessionEntity programme;



}

