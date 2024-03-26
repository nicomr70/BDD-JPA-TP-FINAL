package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestCenterRepository extends JpaRepository<TestCenterEntity, Long> {
    // Récupérer la liste des candidats du TestCenter ayant le code 'GRE' (fonction nommée)
    Optional<CandidateEntity> findAllByTestCenterCode(String code); // on appelle la méthode avec la valeur "GRE" en paramètre
}
