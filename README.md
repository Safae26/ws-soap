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

### Classes Principales

1. **`BanqueService`** - La classe principale du service web
   ```java
   @WebService(serviceName = "BanqueWS")
   public class BanqueService {
       @WebMethod(operationName = "ConversionEuroToDirham")
       public double conversion(@WebParam(name = "montant") double mt) {
           return mt * 10.43;
       }
       
       public Compte getCompte(@WebParam(name = "code") int code) { ... }
       
       @WebMethod
       public List<Compte> listComptes() { ... }
   }
   ```

2. **`Compte`** - Modèle de données pour un compte bancaire
3. **`ServerJWS`** - Classe de déploiement du service
