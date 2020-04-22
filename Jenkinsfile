pipeline {
  environment {
    registry_credentials = "dockerhub"
    dockerImage = ''
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

      stage('Run unit tests') {
        steps {
          script {
            sh './mvnw test'
          }
        }
      }

      stage('Run integration tests') {
	    steps {
	      script {
	        sh './mvnw test -Pintegration-tests'
	      }
	    }
	  }

  

  }
}
