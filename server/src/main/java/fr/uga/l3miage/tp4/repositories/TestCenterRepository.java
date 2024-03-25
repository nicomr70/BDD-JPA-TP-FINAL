package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TestCenterRepository extends JpaRepository<TestCenterEntity, Long> {

    public Set<CandidateEntity> findAllByCodeContaining(String code);
}
