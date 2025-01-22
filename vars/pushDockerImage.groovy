def call() {
  echo 'Pushing Docker Image ....'
  sh 'docker push 143.110.228.135:8083/java-app:2.1'
}