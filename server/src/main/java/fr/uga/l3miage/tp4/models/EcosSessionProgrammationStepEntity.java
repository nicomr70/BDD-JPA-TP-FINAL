package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;

    @Column(updatable = false)
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;
}
