package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;

    private LocalDate submissionDate;

    @ManyToOne
    private ExamEntity exam;
    /*
    * Relation 'correspondA' entre CandidateEvaluationGridEntity et ExamEntity, tq:
    * Chaque grille d'évaluation du candidat correspond à un examen.
    * Chaque examen peut avoir plusieurs grilles d'évaluation de (ou par) candidat.
    */

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteria;
    /*
     * Relation: bidirectionnelle "évalue" entre EvaluationCriteriaEntity et CandidateEvaluationGridEntity
     * génère la table d'association 'evaluationCriteria_candidateEvaluationGridEntities', tq:
     * clé primaire: private Long id (de 'EvaluationCriteriaEntity') et private Long sheetNumber (de 'CandidateEvaluationGridEntity')
     * */

    @ManyToOne
    private CandidateEntity candidate;
}