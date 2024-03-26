package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ExaminerEntity extends UserEntity{
    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenter;
}
