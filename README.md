# Web Service basé sur SOAP pour la Gestion Bancaire

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
<img width="773" alt="BANQUE" src="https://github.com/user-attachments/assets/87b80443-ee79-40f7-8eef-52d8bcb75d71" />

Le service utilise les annotations standard JAX-WS (@WebService, @WebMethod, @WebParam)


2. **`Compte`** - Modèle de données pour un compte bancaire
<img width="773" alt="compte" src="https://github.com/user-attachments/assets/1c1d78b7-fc27-4ef1-b2da-35eb0ad36cf2" />

4. **`ServerJWS`** - Classe de déploiement du service
<img width="773" alt="jws" src="https://github.com/user-attachments/assets/6386c534-bfc1-4c93-940d-480d870c4d5c" />

   - 📊 Schéma XML : Le WSDL généré décrit : La structure des données, les paramètres d'entrée/sortie, les opérations disponibles, et les liaisons SOAP.

## 🚀 Déploiement

- On lancer le serveur
- Le service est disponible à l'adresse : http://localhost:9090/
- Le WSDL peut être consulté via : http://localhost:9090/BanqueWS?wsdl

<img width="1280" alt="s1" src="https://github.com/user-attachments/assets/1f46ed2e-c530-40a8-803e-ccd2464e3bff" />
<img width="1279" alt="s2" src="https://github.com/user-attachments/assets/5e745dfc-3aa9-40b4-af2d-1d8259e9b41a" />
<img width="1280" alt="s3" src="https://github.com/user-attachments/assets/b851e22e-909f-4490-9c24-b8e8a4731db2" />
<img width="1279" alt="s4" src="https://github.com/user-attachments/assets/f29a0f25-bebf-4226-8b32-c4a5ee1f2ded" />

### 🔍 Test du Service
Avec un navigateur : Consultez le WSDL via l'URL ci-dessus pour analyser la structure du service
Avec SoapUI : Créez un nouveau projet SOAP, Importez le WSDL
Testez les opérations : ConversionEuroToDirham, getCompte, listComptes

Client SOAP Java
Pour créer un client Java : wsimport -keep http://localhost:9090/BanqueWS?wsdl
Exemple de code client :


<img width="417" alt="image" src="https://github.com/user-attachments/assets/72c53c9a-39ed-425a-b92b-3e121d972373" />
