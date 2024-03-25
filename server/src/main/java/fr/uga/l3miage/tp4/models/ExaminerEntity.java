package fr.uga.l3miage.tp4.models;

import javax.persistence.ManyToOne;

public class ExaminerEntity extends UserEntity {
    String login;

    String password;

    @ManyToOne
    TestCenterEntity testCenter;
}
