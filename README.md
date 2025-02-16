Implémentation et Déploiement d'une Servlet Java

Projet réalisé dans le cadre du cours d'Applications Distribuées

Nom : Youssef SAADE

Date : 16 février 2025

📌 Description du Projet

Ce projet consiste à implémenter et déployer une Servlet Java qui affiche un message personnalisé :

"Bonjour, Youssef SAADE !"

L'application est déployée sur un serveur Apache Tomcat 10.1.35 et inclut une page HTML qui redirige vers la Servlet.


🛠 Technologies et Versions Utilisées

Java JDK 17 (Oracle Corporation)
Apache Maven 3.9.9
Apache Tomcat 10.1.35
IntelliJ IDEA Ultimate
GitHub pour versioning
MacOS 12.7.6 (x86_64)


1️⃣ Cloner le projet

git clone https://github.com/Yousseffsaade/applications_distribuees.git
cd applications_distribuees/Implementation_et_deploiement_d_une_Servlet_Java_devoir/ServletProject

2️⃣ Installer les dépendances Maven

mvn clean install

3️⃣ Démarrer Apache Tomcat

Depuis IntelliJ IDEA :
Configurer Tomcat 10.1.35
Ajouter un nouvel "Artifact Deployment" : ServletProject:war exploded
Lancer l'application avec Run
Ou manuellement :
cd /Users/Joe/tomcat/bin
./catalina.sh run


🌐 Accès à l'Application

Page principale (HTML) :

👉 http://localhost:8080/ServletProject_war_exploded/
Servlet affichant "Bonjour" :
👉 http://localhost:8080/ServletProject_war_exploded/hello
📜 Explication de la Démarche

Création du projet sous IntelliJ IDEA avec Maven.

Implémentation de la Servlet HelloServlet.java pour afficher "Bonjour, Youssef SAADE !".

Ajout de index.html pour contenir un lien vers la Servlet.

Compilation et génération du .war avec Maven.

Déploiement de l'application sur Tomcat 10.

Tests via navigateur web pour vérifier le bon fonctionnement.


📎 Lien vers le Repository GitHub

📌 https://github.com/Yousseffsaade/applications_distribuees
