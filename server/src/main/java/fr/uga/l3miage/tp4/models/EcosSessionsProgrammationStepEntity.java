package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class EcosSessionsProgrammationStepEntity {
    @Id
    Long id ;
    @Column(updatable = false)
    LocalDateTime dateTime;
    @Column(unique = true)
    String code ;
    @Column(nullable = false)
    String description;
    @ManyToOne
    private EcosSessionsProgrammationEntity ecosSessionsProgrammation ;

}
