package fr.uga.l3miage.tp4.repositories;
import fr.uga.l3miage.tp4.models.EcoSessionProgrammationEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity,Long> {


        //Une méthode par interpollation du nom de fonction qui récupère la première étape de la programmation concernée car le résultat est trié par ordre déscendant de date.
        Optional<EcosSessionProgrammationStepEntity> findFirstByEcoSessionProgrammationOrderByDateTimeDesc(EcoSessionProgrammationEntity ecoSessionProgrammation);

}
