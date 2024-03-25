package fr.uga.l3miage.tp4.models;
import javax.persistence.*;
import java.util.Set;


@Entity
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;

    @ManyToOne
    private Set<TestCenterEntity> testCenters;


}
