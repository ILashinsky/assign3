pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh '/my-app mvn -B -DskipTests clean package' 
            }
        }
    }
}