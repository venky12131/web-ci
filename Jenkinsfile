pipeline {
  agent {
    docker {
      image 'openjdk:8-jdk-alpine'
    }
  }

  stages {
      stage('Package webapp') {
        steps {
          script {
            sh './mvnw clean package -DskipTests'
          }
        }
      }

      stage('Run tests') {
        steps {
          script {
            sh './mvnw test'
          }
        }
      }

      stage('Build Docker image') {
        steps {
          script {
            sh 'docker build . -t xpadro/web-ci'
          }
        }
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
