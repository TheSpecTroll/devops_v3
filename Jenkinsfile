node {
    def mvnHome = tool 'maven-3.5.2'
    tools {
            jdk "JDK"
    }
    stages{
        stage('Wich java'){
            sh 'java --version'
        }

        stage('Clone repo'){
            git branch: 'main', url: 'https://github.com/bart120/devopsb3.git'
        }

        stage('Build project'){
            sh "'${mvnHome}/bin/mvn' -X -B -DskipTests clean package"
        }
    }

}