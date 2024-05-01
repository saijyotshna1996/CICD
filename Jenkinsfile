pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the 'cicd' branch
                git branch: 'cicd', url: 'https://github.com/saijyotshna1996/CICD.git'
            }
        }
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run Maven tests
                sh 'mvn test'
            }
            post {
                always {
                    // Archive the test results
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                // Add deployment steps here
                echo 'Deploying to production...'
                // For example, deploy to a Tomcat server
                // sh 'mvn tomcat7:redeploy'
            }
            // You can add conditions for deploying to specific environments
        }
    }
    post {
        always {
            // Clean up workspace after the pipeline execution
            cleanWs()
        }
    }
}
