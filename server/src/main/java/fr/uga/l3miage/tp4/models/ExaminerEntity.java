package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class ExaminerEntity extends UserEntity{
    @Column(length = 6)
    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenter ;
}
