pipeline {
  agent any

  stages {
      stage('Package webapp') {
        sh './mvnw clean package -DskipTests'
      }

      stage('Run tests') {
        sh './mvnw test'
      }

      stage('Build Docker image') {
          sh 'docker build . -t xpadro/web-ci'
      }

      stage('Second stage') {
          steps {
              script {
                  echo 'This is the second stage'
              }
          }
      }
  }
}
