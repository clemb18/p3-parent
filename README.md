###### BIBLIOTHEQUE MUNICIPALE

WebApp développé pour le compte de la bibliothèque municipale, visant à permettres aux utilisateurs d'emprunter des ouvrages,
de prolonger ces emprunts ainsi que de les clôturer.

Les utilisateurs auront aussi la possibilitée de rechercher des ouvrages par auteur, par date de publication et par titre.

###### Ce projet nécessite :

- Maven 3.6.0 installé dans votre environnement de développement (voir : https://maven.apache.org/install.html)
- Tomcat 8.5 installé dans votre environnement de développement (voir :https://tomcat.apache.org/tomcat-8.0-doc/setup.html)
- Java jdk1.8
- PostgreSql 11.1

###### Installations

###### Installation PostGreSQL

1 - Installer PostGresql sous Windows
    Tutoriel: https://www.veremes.com/installation-postgresql-windows
    
2 - Creation d'une bdd et d'un utilisateur propriétaire de la bdd. 
    Commande: psql -U bibliot -a -f 1_create_db.sql. (Utiliser le script "1_create_db.sql" mis à disposition)
    Renseigner le mot de passe de l'utilisateur bibliot => admin

3 - Initialisation des données 
    Commande: psql -U bibliot -d bibliot -a -f 2_init_db.sql. (Utiliser le script "2_init_db.sql" mis à disposition)
    Renseigner le mot de passe de l'utilisateur bibliot => admin
    
Autre solution:

- Installer PostgreSQL 11.1 => Tutoriel: https://www.veremes.com/installation-postgresql-windows
- Installer Dbeaver
- Cliquer sur "Creer une nouvelle connexion"
- Selectionner PostGreSql
- Renseigner les user et mdp
- Selectionner l'editeur SQL
- Executer le script 1_create_db.sql puis init_db.sql

- user: bibliot 
- mdp: admin

###### Installation Tomcat

- Suivre ce tutoriel => http://objis.com/tutoriel-tomcat-n1-installation-tomcat-8/

###### Deploiement des WebServices et WebApp

Copier les dossier Bibliotheque WS et Bibliotheque WebApp  vers le sous-dossier webapps de votre installation tomcat

Via la console, rendez-vous au dossier d'installation tomcat/bin et taper la ligne de commande suivante:  catalina.bat start

###### Deploiement du batch

- Pour utiliser Gmail comme serveur SMTP, penser à autoriser l'accès aux applications  : https://myaccount.google.com/security?pli=1#connectedapps
- Pour ajouter le lancement à un crontab : 
    Taper crontab -e pour éditer le crontab du serveur
    Ajouter la ligne ci-dessous pour un lancement tous les jours à 00:00

    0 0 * * * java -jar /path/to/bibliotheque-batch.jar

###### Accéder à l'application

Allez sur l'URL : http://localhost:8181/bibliotheque_webapp_war_exploded/


###### Auteur
Clément Biotteau