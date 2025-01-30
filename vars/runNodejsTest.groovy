def call() {
  echo 'Testing Nodejs App....'
  sh '''
    cd ./app
    npm run test
    '''
}