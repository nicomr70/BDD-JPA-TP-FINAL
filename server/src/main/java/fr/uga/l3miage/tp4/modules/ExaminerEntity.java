package fr.uga.l3miage.tp4.modules;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExaminerEntity extends UserEntity{

    private String login;

    private String password;


    @ManyToOne
    @JoinColumn(name = "test_center_id")
    private TestCenterEntity testCenterEntity;
}
