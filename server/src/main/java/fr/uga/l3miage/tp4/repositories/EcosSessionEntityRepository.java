package fr.uga.l3miage.tp4.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.uga.l3miage.tp4.models.EcosSessionEntity;

@Repository
public interface EcosSessionEntityRepository extends JpaRepository<EcosSessionEntity, Long> {
}
