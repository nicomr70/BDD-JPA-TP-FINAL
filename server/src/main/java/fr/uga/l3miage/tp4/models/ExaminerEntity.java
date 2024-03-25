package fr.uga.l3miage.tp4.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ExaminerEntity")
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;
}
