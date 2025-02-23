CalculatorPlus - Java RMI

Un projet en Java RMI (Remote Method Invocation) permettant d'exécuter des opérations mathématiques à distance à travers un modèle client-serveur.

📌 Description

Ce projet met en place un service Calculator distribué où :

Un serveur expose un service de calcul à distance.

Un client se connecte au serveur pour effectuer des opérations mathématiques.

L'implémentation repose sur l'utilisation de Java RMI pour permettre l'exécution de méthodes distantes.

Le projet est une extension améliorée du service initial, avec une meilleure structuration et une gestion des erreurs optimisée.

Installation & Configuration

1️⃣ Prérequis

Java 8 ou plus

IntelliJ IDEA (ou tout autre IDE compatible)

Terminal / Console pour exécuter les commandes

2️⃣ Compilation des fichiers

Dans le dossier src, exécute la commande suivante pour compiler les fichiers :

javac calculator/*.java

3️⃣ Lancement du registre RMI

Avant d’exécuter le serveur, il faut démarrer le registre RMI :

rmiregistry &

4️⃣ Lancement du serveur

java -cp . calculator.CalculatorServer

✅ Message attendu : CalculatorService démarré avec succès !

5️⃣ Exécution du client

Dans un autre terminal, exécute :

java -cp . calculator.CalculatorClient

✅ Résultats attendus :

Addition (5 + 3) : 8

Multiplication (4 * 6) : 24

Soustraction (10 - 2) : 8

Division (8 / 2) : 4

Fonctionnalités

✅ Implémentation d'un service RMI

✅ Communication client-serveur à distance

✅ Prise en charge des opérations de base (+ , - , × , ÷)

✅ Gestion des erreurs et stabilité du service
