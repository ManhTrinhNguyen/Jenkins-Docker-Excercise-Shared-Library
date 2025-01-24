def call() {
  echo 'Updating Patch Version ....'
  sh 'gradle patchVersionUpdate'
}