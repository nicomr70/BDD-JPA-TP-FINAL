package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TestCenterRepository extends JpaRepository<TestCenterEntity, Long> {



}
