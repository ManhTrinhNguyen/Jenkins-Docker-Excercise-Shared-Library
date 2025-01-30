def call (String gitUrl, branch){
  withCredentials([usernamePassword(credentialsId: 'github-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')]){
    sh "git remote set-url origin https://${USER}:${PWD}@${gitUrl}"

    sh 'git config --global user.email jenkins@gmail.com'
    sh 'git config --global user.name Jenkins'

    sh 'git status'
    sh 'git config --list'

    sh 'git add .'
    sh 'git commit -m "ci: bump version"'
    sh "git push origin HEAD:${branch}"
  }
}