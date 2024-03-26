package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;

    private String label;

    @OneToOne(mappedBy = "ecoSessionProgrammation")
    private EcosSessionEntity ecosSessionEntity;

    /*
    * -> Relation: EstProgramméPar, relation OneToOne bidirectionnelle entre EcosSessionEntity et EcosSessionProgrammationEntity
    *
    * lorsque j'accede à une instance de EcosSessionProgrammationEntity, je peux également accéder à l'instance
    * correspondante de EcosSessionEntity via la propriété "ecoSessionProgrammation".
    * <=>
    * La clause mappedBy = "ecoSessionProgrammation" indique que la relation entre EcosSessionEntity et
    * EcosSessionProgrammationEntity est déjà mappée (= gérée) par l'attribut "ecoSessionProgrammation" dans l'entité
    * 'EcosSessionEntity.'
    */

    @OneToMany(mappedBy = "ecosSessionProgrammation", cascade = CascadeType.ALL) // Utile le cascade ? -> cela signifie que lorsque j'effectuerai une opération de persistence sur une EcosSessionProgrammationEntity, par exemple une telle opération dans la BD, les changements seront également appliqués à toutes les étapes associées à cette programmation de session 'ecosSession'
    private Set<EcosSessionProgrammationStepEntity> steps;

    /*
     * Relation "aPourEtapes" entre EcosSessionProgrammationEntity et EcosSessionProgrammationStepEntity, tq:
     * Chaque programmation de session 'ecosSessionProgrammation' peut avoir plusieurs étapes.
     * Chaque étape appartient à une seule programmation de session 'ecosSessionProgrammation'.
     */
}
