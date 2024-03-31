package fr.uga.l3miage.tp4.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.l3miage.tp4.enumeration.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;

@Repository
public interface TestCenterRepository extends JpaRepository<TestCenterEntity,Long>{
    Set<CandidateEntity> findAllByTestCenterCode(TestCenterCode code);
}
