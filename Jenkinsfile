pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh ' mvn -f /my-app/pom.xml -B -DskipTests clean package' 
            }
        }
    }
}