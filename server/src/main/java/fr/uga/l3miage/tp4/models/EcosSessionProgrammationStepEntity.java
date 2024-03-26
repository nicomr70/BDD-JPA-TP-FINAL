package fr.uga.l3miage.tp4.models;

import org.hibernate.type.StringNVarcharType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;
    //FINAL OLMASI LAZIMMMM
    @Column(updatable = false)
    private LocalDateTime dateTime;
    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private String description;
}
