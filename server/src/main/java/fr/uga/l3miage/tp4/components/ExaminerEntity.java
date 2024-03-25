package fr.uga.l3miage.tp4.components;
import javax.persistence.*;
import java.util.Set;


@Entity
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;

    @ManyToMany(mappedBy = "examiner")
    private Set<TestCenterEntity> testCenters;


}

