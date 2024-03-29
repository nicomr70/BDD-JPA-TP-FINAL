package fr.uga.l3miage.tp4.models;



import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
public class EcosSessionProgrammationStepEntity {

    @Id
    private long id;

    @Column(updatable = false)
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;


    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;
}
