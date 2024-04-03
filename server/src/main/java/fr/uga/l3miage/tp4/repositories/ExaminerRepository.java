package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.ExaminerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminerRepository extends JpaRepository<ExaminerEntity, Long> {
    // Custom query methods can be defined here if needed
}
