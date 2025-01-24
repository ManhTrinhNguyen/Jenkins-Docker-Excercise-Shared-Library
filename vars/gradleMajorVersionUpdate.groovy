def call() {
  echo 'Updating Major Version ....'
  sh 'gradle majorVersionUpdate'
}