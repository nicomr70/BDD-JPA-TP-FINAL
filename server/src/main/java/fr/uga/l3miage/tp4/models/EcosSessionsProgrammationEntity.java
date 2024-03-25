package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class EcosSessionsProgrammationEntity {
    @Id
    private Long id;

    private String label;
}
