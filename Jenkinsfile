pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/AlaaJanadi/mvn-spring-boot-app-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Integration Test') {
            steps {
                // Run your integration tests here
                sh 'mvn verify'
            }
        }
    }

    post {
        success {
            echo 'All tests passed! Deploying...'
            // Add deployment steps here
        }
        failure {
            echo 'Tests failed! Deployment aborted.'
        }
    }
}

