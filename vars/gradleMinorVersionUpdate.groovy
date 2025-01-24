def call() {
  echo 'Updating Minor Version ....'
  sh 'gradle minorVersionUpdate'
}