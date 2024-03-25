package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class TestCenterEntity {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private TestCenterCode code;

    private String university;

    private String city;
}
