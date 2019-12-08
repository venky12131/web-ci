pipeline {
  environment {
    registry_credentials = "dockerhub"
  }

  agent any

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

      stage('Coverage stage') {
        steps {
          cobertura coberturaReportFile: '**/coverage.xml'
        }
      }

      stage('Build Docker image') {
        steps {
          script {
            def dockerImage = docker.build("xpadro/web-ci:${env.BUILD_ID}")
          }
        }
      }

      stage('Push image') {
        steps{
          script {
            docker.withRegistry( '', registry_credentials ) {
              dockerImage.push()
            }
          }
        }
      }

  }
}
