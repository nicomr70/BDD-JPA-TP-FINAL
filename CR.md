#   Binome : 
## BENAMMAR Mahmoud  &  BOUGUESSA Nour

### notes:
- Pour la modélisation du diagramme il y-avait une petite hésitation sur le type de relation entre le ExaminerEntity et CandidateEvaluationGridEntity si c'était bi ou uni-diréctionnelle si on a opté pour le OneToMany unidiréctionnelle ca aurait créer une nouvelle table donc on a opté sur une relation bidiréctionnelle comme ca on aurait 12 tables au total (comme demandé).

- On a créé tous les components de toutes les entitées et on a appliqué La méthode CRUD sur tous les components comme on a fait au TP3-JPA.

- Pour la question "Récupérer la dernière étape de la programmation qui devra être réalisée (fonction nommée)"

On n'a pas vraiment compris la question s'il faut créer un nouveau component au nom du repertoire ou l'implémenter dans CandidateComponent. On a mis une fonction "findTopByEcosSessionProgrammationEntityOrderByDateTimeDesc" dans le fichier EcosSessionProgrammationStepRepository. A la fin on a opté pour créer tout le components de toutes les entités comme expliquer dans le point précédant. 

- Pour les autres questions, on n'avait pas de problème.