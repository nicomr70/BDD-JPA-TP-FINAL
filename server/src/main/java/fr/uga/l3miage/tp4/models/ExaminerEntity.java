package fr.uga.l3miage.tp4.models;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExaminerEntity extends  UserEntity{

    private String login;

    private String password;

    @ManyToOne
    private TestCenterEntity testCenter;
}
