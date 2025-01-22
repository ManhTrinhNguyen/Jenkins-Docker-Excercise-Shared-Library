def call(String imageName) {
  echo 'Pushing Docker Image ....'
  sh "docker push $imageName"
}