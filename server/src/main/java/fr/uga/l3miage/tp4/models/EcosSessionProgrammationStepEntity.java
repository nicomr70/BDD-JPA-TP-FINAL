package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.time.LocalDateTime;



@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;
    @Column(nullable = false )
    private final  LocalDateTime dateTime = LocalDateTime.now();
    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private  String description;
    @ManyToOne // Une EcosSessionProgrammation
    private  EcosSessionProgrammationEntity ecosSessionProgrammation;
}
