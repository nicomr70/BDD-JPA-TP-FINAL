package fr.uga.l3miage.tp4.modules;



import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
public class EcosSessionProgrammationStepEntity {

    @Id
    private long id;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;


    @ManyToOne
    @JoinColumn( name= "ecosessionProg_id")
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;
}
