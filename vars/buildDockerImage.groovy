import com.example.Docker

def call(String imageName) {
  // echo 'Building Docker Image ....'
  // sh "docker build -t $imageName ."
  return new Docker(this).buildDockerImage(imageName)
}