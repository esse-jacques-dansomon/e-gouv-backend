# e-Senegal Backend

## Description

e-Senegal est une plateforme de e-gouvernance destinée à faciliter l'interaction entre les citoyens, les entreprises et l'administration sénégalaise à travers une série de microservices.

## Architecture des Microservices

- **citizen-service** : Gère les informations des citoyens, y compris l'enregistrement, la modification et la consultation des données personnelles.
- **common-service** : Services partagés, comme l'authentification, la gestion des rôles, etc.
- **company-service** : Gère les informations des entreprises et leurs interactions avec l'administration.
- **config-server** : Serveur de configuration centralisé pour tous les microservices.
- **demand-service** : Gère les demandes des utilisateurs (citoyens ou entreprises) pour divers services publics.
- **eureka-server** : Serveur de découverte pour tous les microservices. Utilisé pour la résilience et la scalabilité des services.
- **gateway-server** : API Gateway qui centralise et gère les appels aux différents microservices.
- **notification-service** : Gère l'envoi des notifications par email, SMS, etc.
- **payment-service** : Gère les paiements, y compris les intégrations avec des services de paiement tiers.

## Prérequis

- **JDK 17** ou supérieur
- **Maven 3** ou supérieur
- **Docker** et **Docker Compose**
- **PostgreSQL** (ou tout autre système de gestion de base de données relationnelle pris en charge)

## Configuration

1. **Cloner le dépôt** :

   ```bash
   git clone https://github.com/votre-repo/e-senegal-backend.git
   cd e-senegal-backend
   ```

2. **Configurer les fichiers de propriétés** :

   Les configurations pour chaque service sont centralisées dans `config-server`. Assurez-vous de mettre à jour les fichiers de configuration sous `resources` avec vos paramètres spécifiques (base de données, email, etc.).

## Démarrage

### Localement

1. **Démarrer le serveur de configuration** :

   ```bash
   cd config-server
   mvn spring-boot:run
   ```

2. **Démarrer Eureka Server** :

   ```bash
   cd ../eureka-server
   mvn spring-boot:run
   ```

3. **Démarrer les autres services** (dans des terminaux séparés) :

   ```bash
   cd ../citizen-service
   mvn spring-boot:run

   cd ../company-service
   mvn spring-boot:run

   cd ../demand-service
   mvn spring-boot:run

   cd ../notification-service
   mvn spring-boot:run

   cd ../payment-service
   mvn spring-boot:run
   ```

4. **Démarrer l'API Gateway** :

   ```bash
   cd ../gateway-server
   mvn spring-boot:run
   ```

### Avec Docker

1. **Lancer tous les services avec Docker Compose** :

   ```bash
   docker-compose up --build
   ```

   Cela démarrera tous les services définis dans le fichier `docker-compose.yml`.

## Tests

Pour tester l'application, vous pouvez utiliser Postman ou tout autre client HTTP pour envoyer des requêtes aux différentes routes définies dans les services. Assurez-vous que tous les services sont en cours d'exécution et accessibles via l'API Gateway.

## Maintenance

- **Surveillance** : Utilisez des outils comme Prometheus et Grafana pour surveiller les performances.
- **Logs** : Centralisez les logs avec un service de logging ou une stack ELK pour faciliter le débogage et la surveillance.
- **Sécurité** : Assurez-vous de maintenir à jour tous les composants de sécurité, y compris les dépendances de Maven.
