pipeline {
  environment {
    registry = "https://hub.docker.com/repository/docker/xpadro/web-ci"
    docker_credentials = "dockerhub"
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
            def customImage = docker.build("xpadro/web-ci:${env.BUILD_ID}")
          }
        }
      }

  }
}
