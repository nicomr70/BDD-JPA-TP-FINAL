package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ExaminerEntity extends UserEntity{
    String login;
    String password;
    @ManyToOne
    private TestCenterEntity testCenter;
}
