package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("E")
public class ExaminerEntity extends  UserEntity {
    @Column(length = 6)
    private String login;

    private String password;

    @ManyToOne
    @JoinColumn(name = "id_test_center", referencedColumnName = "id")
    private TestCenterEntity testCenter;


}
