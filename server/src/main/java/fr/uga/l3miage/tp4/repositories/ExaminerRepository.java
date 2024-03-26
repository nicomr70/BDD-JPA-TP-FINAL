package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.ExaminerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExaminerRepository extends JpaRepository<ExaminerEntity, String> {
}
