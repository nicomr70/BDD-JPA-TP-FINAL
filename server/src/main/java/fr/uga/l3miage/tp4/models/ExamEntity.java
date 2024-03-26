package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Column(unique = true)
    private String name;

    private int weight;

    @ManyToOne
    private EcosSessionEntity ecosSession;
    /* Relation: "estFaitDans" bidirectionnelle, tq:
     * Chaque session 'ecosSession' peut être composée de plusieurs examens.
     * Chaque examen appartient à une seule session 'ecosSession'.
     */

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL) // utile ? -> Par exemple, si une programmation de session est supprimée, toutes ses étapes de programmation seront également supprimées automatiquement,
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
    /*
     * Relation 'aPourGrillesDEvaluations' entre CandidateEvaluationGridEntity et ExamEntity, tq:
     * Chaque grille d'évaluation du candidat correspond à un examen.
     * Chaque examen peut avoir plusieurs grilles d'évaluation de (ou par) candidat.
     */

    @ManyToMany
    private Set<SkillEntity> skills ;
}
