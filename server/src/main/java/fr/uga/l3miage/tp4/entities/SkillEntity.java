package fr.uga.l3miage.tp4.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
