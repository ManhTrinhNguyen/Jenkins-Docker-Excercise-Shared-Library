def call() {
  echo 'Building Docker Image ....'
  sh 'docker build -t 143.110.228.135:8083/java-app:2.1 .'
}