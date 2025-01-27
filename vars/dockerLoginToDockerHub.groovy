def call() {
  echo 'Logging into Docker repo ....'
  withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')]){
    sh "echo ${PWD} | docker login -u ${USER} --password-stdin"
  }
}
