# Binôme: HADDAD Rayane, TIDJANI Manyl
# dépôt git: https://github.com/l3miage-tidjanma/BDD-JPA-TP-FINAL
# #####################################

# Questions à se poser à chaque implémentation:
-------------------------------------------------------------------------------
- les relations sont-elles unidirectionnelles ou bidirectionnelles ? 
  - Si bidirectionnelles, où mettre le mappedBy ?
- comment atteindre le nombre minimal de tables ? (et surtout, les compter, tq max=12)
- Dans les relations ManyToMany, besoin de créer une table en plus ou pas ?

* en plus: ecrire en anglais chaque entité ?
-------------------------------------------------------------------------------

# Questions que je me suis posé durant l'implémentation de mon code (Manyl):
-------------------------------------------------------------------------------
Mais dans ce cas, le mappedBy = "ecoSessionProgrammation" montre que la relation entre ces deux classes est gérée par l'attribut "ecoSessionProgrammation" dans l'entité 'EcosSessionEntity'. est-ce que faire l'inverse, càd mappedBy = "ecoSession" dans l'entité EcosSessionEntity, serait utile voir pertinent ou pas du tout ?
->
d'après chatGPT:
"Inverser mappedBy entre les deux entités serait approprié dans certains cas, mais cela dépend principalement de la logique métier de votre application.

Dans une relation bidirectionnelle, mappedBy devrait être défini dans l'entité inverse de la relation, c'est-à-dire celle qui ne possède pas la clé étrangère. Si vous avez une relation OneToOne bidirectionnelle entre EcosSessionEntity et EcosSessionProgrammationEntity, et que vous inversez mappedBy dans l'entité EcosSessionEntity, cela signifierait que EcosSessionEntity devient l'entité inverse de la relation.

Cela pourrait être pertinent si vous voulez rendre EcosSessionEntity responsable de la gestion de la relation. Par exemple, si vous prévoyez de supprimer EcosSessionEntity et que vous voulez également supprimer l'entité EcosSessionProgrammationEntity associée, cela pourrait être une raison pour inverser mappedBy dans EcosSessionEntity."
--> est-ce vrai ?
-------------------------------------------------------------------------------

-------------------------------------------------------------------------------
@OneToMany(mappedBy = "ecosSessionProgrammation", cascade = CascadeType.ALL)
Utile le cascade ? -> cela signifie que lorsque j'effectuerai une opération de persistence sur une EcosSessionProgrammationEntity, par exemple une telle opération dans la BD, les changements seront également appliqués à toutes les étapes associées à cette programmation de session 'ecosSession'
-------------------------------------------------------------------------------

##  Pour les requetes:
Faut-il créer un component en plus ?
->