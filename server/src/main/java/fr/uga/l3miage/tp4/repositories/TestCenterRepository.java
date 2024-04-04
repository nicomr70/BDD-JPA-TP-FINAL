package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;

@Repository
public interface TestCenterRepository extends JpaRepository<TestCenterEntity, Long > {
    TestCenterEntity findByCode(TestCenterCode code);

}
