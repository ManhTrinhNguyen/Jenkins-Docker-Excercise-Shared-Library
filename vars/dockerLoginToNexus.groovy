def call() {
  echo 'Logging into Nexus repo ....'
  withCredentials([usernamePassword(credentialsId: 'nexus-credentials', usernameVariable: 'USER', usernamePassword: 'PWD')]){
    sh "echo ${PWD} | docker login -u ${USER} --password-stdin 143.110.228.135:8083"
  }
}
