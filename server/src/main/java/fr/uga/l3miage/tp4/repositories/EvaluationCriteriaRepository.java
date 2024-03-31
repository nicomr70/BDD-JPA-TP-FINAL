package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EvaluationCriteriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationCriteriaRepository extends JpaRepository<EvaluationCriteriaEntity, Long> {

}
