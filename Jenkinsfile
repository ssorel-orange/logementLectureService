pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps{
                build job: 'LogementService_build'
            }
        }
        stage('Package Application'){
           steps {
                sh "pwd"
                sh "ls -a"
                sh "docker build ./ -t logement_service:${env.BUILD_ID}"
            }
            
        }
    }
}

