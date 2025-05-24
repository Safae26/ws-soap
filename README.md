# Web Service SOAP pour la Gestion Bancaire

![Java](https://img.shields.io/badge/Java-17-blue)
![SOAP](https://img.shields.io/badge/Protocol-SOAP-orange)
![JAX-WS](https://img.shields.io/badge/Framework-JAX--WS-green)

Un service web SOAP simple pour les opérations bancaires de base, déployé avec JAX-WS.

## 📋 Fonctionnalités

Le service web offre trois opérations principales :

- **Conversion de devises** : Convertir un montant de l'euro au dirham marocain (DH)
- **Consultation de compte** : Obtenir les détails d'un compte bancaire spécifique
- **Liste des comptes** : Récupérer une liste de comptes bancaires

## 🛠️ Structure du Projet

### Dépendances (pom.xml)
   - Spring Boot Starter
   - JAX-WS RI (Runtime Implementation)
### Classes Principales

1. **`BanqueService`** - La classe principale du service web
<img width="773" alt="service" src="https://github.com/user-attachments/assets/c79dd900-cdec-4dd1-b750-16c9371091e1" />

Le service utilise les annotations standard JAX-WS (@WebService, @WebMethod, @WebParam)


2. **`Compte`** - Modèle de données pour un compte bancaire
<img width="774" alt="compte" src="https://github.com/user-attachments/assets/9b41a0c9-405f-4b8b-89dc-ada6aa2a785c" />

4. **`ServerJWS`** - Classe de déploiement du service
<img width="773" alt="jws" src="https://github.com/user-attachments/assets/6386c534-bfc1-4c93-940d-480d870c4d5c" />

   - 📊 Schéma XML : Le WSDL généré décrit : La structure des données, les paramètres d'entrée/sortie, les opérations disponibles, et les liaisons SOAP.

## 🚀 Déploiement

- On lancer le serveur
- Le service est disponible à l'adresse : http://localhost:9090/
- Le WSDL peut être consulté via : http://localhost:9090/BanqueWS?wsdl

### 🔍 Test du Service
Avec un navigateur : Consultez le WSDL via l'URL ci-dessus pour analyser la structure du service
Avec SoapUI : Créez un nouveau projet SOAP, Importez le WSDL
Testez les opérations : ConversionEuroToDirham, getCompte, listComptes
