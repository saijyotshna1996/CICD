pipeline {
    agent any

    tools {
        // Define the Maven tool configured in Jenkins
        maven 'Maven 3.8.1'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the branch that triggered the build
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run tests using Maven
                sh 'mvn test'
            }
            post {
                always {
                    // Archive JUnit-formatted test results
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Deploy') {
            when {
                // Execute this stage only on the master branch
                branch 'master'
            }
            steps {
                echo 'Deploying to Production'
                // Include production deployment scripts or commands here
            }
        }
        stage('Staging Deployment') {
            when {
                // Execute this stage only on the staging branch
                branch 'staging'
            }
            steps {
                echo 'Deploying to Staging'
                // Include staging deployment scripts or commands here
            }
        }
        stage('Development Deployment') {
            when {
                // Execute this stage only on the dev branch
                branch 'dev'
            }
            steps {
                echo 'Deploying to Development Environment'
                // Include development deployment scripts or commands here
            }
        }
    }
    post {
        always {
            // Clean up the workspace after the pipeline execution
            cleanWs()
        }
    }
}
