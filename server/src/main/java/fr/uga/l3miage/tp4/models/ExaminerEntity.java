package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;

@Entity
public class ExaminerEntity extends UserEntity{
    String login;
    String password;
}
