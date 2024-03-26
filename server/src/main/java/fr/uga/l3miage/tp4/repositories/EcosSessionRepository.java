package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.EcosSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcosSessionRepository extends JpaRepository<EcosSessionEntity, Long> {
}
