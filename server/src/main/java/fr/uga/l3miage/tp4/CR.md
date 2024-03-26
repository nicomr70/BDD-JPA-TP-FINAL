Rendu BDD TP4 JPA noté L3 Miage 26/03/2024

Binome1: MBAYAM Hippolyte Djegomde
Binome2: KENGNI Cedrix
1-Implementation des modèles en JPA:
Voir le code des fichiers dans models

2- Implementation des Repositories:
NB: on a pas implémenté le Repository de la classe abstraite User, mais on a plutot preféré implémenter ceux des ses descendant

3- Implementation des requetes:
NB: On a pas bien compris s'il faut créer des fichiers Components pour chaque Entité qu'on doit utiliser dans une requete,
ou ne doit se servir que des deux fichiers CandidatComponent et ExamComponent que vous nous avez fournis à l'avance.
De ce fait on a ajouté des fichiers Componets dont on en voyait l'utilité pour pouvoir y définir des requetes

    1)Récupérer la dernière étape de la programmation qui devra être réalisée
      '''java
          EcosSessionProgrammationStepEntity findTopByOrderByDateTimeDescAndEcosSessionProgrammation_EcosSession_Status(SessionStatus status); 
      '''
      // Requete appelée dans EcosSessionProgrammationStepComponent

    2)Récupérer la liste des candidats du TestCenter ayant le code 'GRE'
    ..........

    3)Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5)
    .........

    4)Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000
    ''' java
        Set<CandidateEntity> findAllByHasExtraTimeIsFalseAndBirthDateBefore(LocalDateTime birthDate);
    '''
    // Requete appelée dans CandidateComponent.

    5)Récupérer la liste des examens qui évaluent au moins une compétence en lien avec 'cardio' contenu dans le nom:
    ''' java
        Set<ExamEntity> findAllBySkillsContaining(String skillWord); 
    '''
    // Requete appelée dans ExamComponent.