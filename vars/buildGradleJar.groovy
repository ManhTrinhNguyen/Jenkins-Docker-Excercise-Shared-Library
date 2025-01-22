def call() {
  echo 'Building Gradle package ....'
  sh 'gradle clean build'
}