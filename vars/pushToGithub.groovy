def call (){
  withCredentials([usernamePassword(credentialsId: 'github-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')]){
    sh "git remote set-url origin https://${USER}:${PWD}@github.com/ManhTrinhNguyen/jenkins-exercise.git"

    sh 'git config --global user.email jenkins@gmail.com'
    sh 'git config --global user.name Jenkins'

    sh 'git status'
    sh 'git config --list'

    sh 'git add .'
    sh 'git commit -m "ci: bump version"'
    sh 'git push origin HEAD:Using-Shared-Library'
  }
}