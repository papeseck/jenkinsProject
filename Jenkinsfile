pipeline {
    agent any
    tools {
        maven "maven_3_9_6"
    }
    stages {
        stage("Build Maven") {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/papeseck/jenkinsProject']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    dir('C:/Users/Pape Diabel/Project/jenkinsProject') {
                        bat 'docker build -t papeseck/jenkinsproject .'
                    }
                }
            }
        }

        }

    }
