package fr.uga.l3miage.tp4.models;

import javax.persistence.ManyToOne;

public class ExaminerEntity extends UserEntity {
    private String login;

    private String password;

    @ManyToOne
    private TestCenterEntity testCenter;
}
