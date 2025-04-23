1-Comment Thymeleaf aide-t-il à créer du contenu Web dynamique ?

Thymeleaf permet de créer des pages HTML dynamiques en liant facilement les données Java à l’interface (boucles, conditions, fragments…).

2-Quel est le but de la@Validannotation dans la gestion des formulaires ?

@Valid active la validation automatique des formulaires côté serveur. Empêche les données invalides d’être traitées.

3-Comment fonctionne le mécanisme d'attribut flash dans Spring MVC ?

Attribut flash (Flash Attributes) sert à transmettre temporairement des données lors d’une redirection (ex : message de succès).

4-Expliquez l’architecture en couches utilisée dans cette application.

Architecture en couches
    - Controller : gère les requêtes.
    - Service : contient la logique métier.
    - Repository : accès aux données.
    - Model : représente les entités.

5-Comment étendriez-vous cette application pour utiliser une véritable base de données au lieu d'un stockage en mémoire ?

Passer à une base de données réelle
    - Ajouter les dépendances JPA + driver (ex : PostgreSQL).
    - Configurer la base dans `application.properties`.
    - Remplacer les listes en mémoire par des entités JPA + repositories.

