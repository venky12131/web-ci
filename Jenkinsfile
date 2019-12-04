pipeline {
  agent { node { label 'docker' } }

  stages {
      stage('First stage') {
          steps {
              script {
                  echo 'First stage'
              }
          }
      }
      stage('Second stage') {
          steps {
              script {
                  echo 'Second stage'
              }
          }
      }
  }
}
