package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ExaminerEntity extends UserEntity{

    @Column(length = 6)
    private String login;

    private String password;
}
