pipeline {
    agent any
    stages{
         stage('Build'){
            steps{
                bat 'mvn clean install -DskipTests=true'
            }
        }
        stage('Run'){
            steps{
                bat 'mvn clean test -Dconfig=\'%CONFIG%\' -DsuiteXml=\'%SUITE%\''
            }
        }
    }
    post {
        always{

            allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
        }
    }
}