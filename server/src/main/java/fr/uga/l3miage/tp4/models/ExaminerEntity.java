package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ExaminerEntity extends UserEntity{

    @Column(length = 6)
    private String login;
    private String password;
    @ManyToOne
    private TestCenterEntity testCenter;
}
