pipeline {
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
            sh 'docker build . -t xpadro/web-ci'
          }
        }
      }

  }
}
