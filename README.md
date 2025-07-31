# Implémentation d’une solution IAM avec Keycloak pour sécuriser une plateforme Spring Boot

## Description

Ce projet a pour but de sécuriser une application Java Spring Boot en utilisant Keycloak comme solution IAM (Identity and Access Management).  
Il permet de gérer l’authentification, les rôles, et les accès utilisateurs via Keycloak.

## Technologies

- Java 17+
- Spring Boot
- Spring Security
- Keycloak
- Maven

## Installation

1. Démarrer le serveur Keycloak localement
2. Configurer `application.properties` :
```properties
spring.security.oauth2.client.registration.keycloak.client-id=app-client
spring.security.oauth2.client.registration.keycloak.client-secret=secret
spring.security.oauth2.client.provider.keycloak.issuer-uri=http://localhost:8080/realms/mon-realm
