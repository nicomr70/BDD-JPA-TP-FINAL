package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkillEntity {

    @Id
    private Long id;

    @Column(unique = true)
    private String name;


}