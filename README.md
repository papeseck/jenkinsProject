# JenkinsProject 
Description du Projet
Ce projet pratique (TP) sur Jenkins vise à fournir une introduction pratique à l'utilisation de Jenkins pour l'intégration continue et
le déploiement continu (CI/CD). Jenkins est un outil open-source puissant permettant d'automatiser divers aspects du cycle de vie du développement logiciel

## Prérequis
Assurez-vous que les outils suivants sont installés sur votre système avant de commencer :

Jenkins
Git
Maven
Docker

##Configuration du Projet
Clonez le projet : Clonez ce dépôt Git sur votre machine locale.

git clone https://github.com/papeseck/jenkinsProject.git
Configuration de Jenkins : Installez et configurez Jenkins sur votre serveur local ou utilisez une instance Jenkins en ligne. Créez un nouveau projet Jenkins.

Configuration du Projet : Configurez le projet Jenkins nouvellement créé en utilisant la configuration suivante :

Source de Code : Intégration avec le dépôt Git cloné.
Build : Utilisez Maven pour le build (mvn clean install).
Étapes de Test : Intégrez des étapes de test automatisées.
Déploiement : Configurez le déploiement avec Docker.

##Instructions pour le Build

# Build Maven
mvn clean install

# Build Docker image
docker build -t diabel/jenkinsproject .

##Ci-dessous quelques captures de mon pipeline
<img width="957" alt="jenkinsProject" src="https://github.com/papeseck/jenkinsProject/assets/102872504/6008493d-dd50-4116-99c5-43d6dc44e02d">

# Push Image to Docker Hub
docker login -u username -p password
docker push diabel/jenkinsproject
<img width="935" alt="jenkinsPr" src="https://github.com/papeseck/jenkinsProject/assets/102872504/3cb6f1f1-8cb5-4cb7-99f8-afebc3e03bef">

<img width="959" alt="consoleJenkins" src="https://github.com/papeseck/jenkinsProject/assets/102872504/a90e898a-8ae0-41a1-9dac-c5e54bc32809">


