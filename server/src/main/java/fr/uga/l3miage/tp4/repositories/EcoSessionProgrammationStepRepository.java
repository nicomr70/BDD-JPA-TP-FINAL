package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcoSessionProgrammationEntity;
import fr.uga.l3miage.tp4.models.EcoSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface EcoSessionProgrammationStepRepository extends JpaRepository<EcoSessionProgrammationStepEntity,String> {

    //tentative échouée : Récupérer la dernière étape de la programmation qui devra être réalisée (fonction nommée)
    public EcoSessionProgrammationStepEntity findTopBy();
}