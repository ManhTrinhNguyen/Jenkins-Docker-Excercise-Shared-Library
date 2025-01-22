def call() {
  echo 'Building Maven Package ......'
  sh 'mvn clean package'
}