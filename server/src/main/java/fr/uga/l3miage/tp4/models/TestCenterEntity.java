package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestCenterEntity {
    @Id
    private Long id ;
    private TestCenterCode code ;
    private String university ;
    private String city ;
}
