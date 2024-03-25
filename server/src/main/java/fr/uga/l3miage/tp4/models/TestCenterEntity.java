package fr.uga.l3miage.tp4.models;


import fr.uga.l3miage.tp4.enums.SessionStatus;
import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestCenterEntity {
    @Id
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private TestCenterCode code;

    private String university;

    private String city;

    /*
    code a réutiliser

    private Date releaseDate;

    @OneToMany(mappedBy = "albumEntity",cascade = CascadeType.ALL)
    private Set<SongEntity> songEntities;

    @ManyToOne
    private ArtistEntity artistEntity;*/
}

