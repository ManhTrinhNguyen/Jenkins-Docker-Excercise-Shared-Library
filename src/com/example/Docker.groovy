package com.example 

class Docker implements Serializable {

  def script 

  Docker(script) {
    this.script = script
  }

  def buildDockerImage(String imageName) {
    script.echo 'Building Docker image'
    script.sh "docker build -t $imageName ."
  }

}