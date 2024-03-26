package fr.uga.l3miage.tp4.models;



import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
public class EcosSessionProgrammationStepEntity {

    @Id
    private long id;

    private LocalDateTime dateTime;

    private String code;

    private String description;


    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;
}
