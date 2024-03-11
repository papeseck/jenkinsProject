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
          stage('Push Image to Docker Hub') {
                    steps {
                        script {
                            withCredentials([usernameColonPassword(credentialsId: 'pds', variable: 'dockerHub')]) {
                                bat "docker login -u diabel -p Pape12345"
                                bat 'docker push papeseck/jenkinsproject'
                            }


                        }
                    }
                }

        }

    }
