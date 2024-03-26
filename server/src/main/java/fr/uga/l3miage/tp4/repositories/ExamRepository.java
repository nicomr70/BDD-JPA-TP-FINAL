package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity, Long> {

}
