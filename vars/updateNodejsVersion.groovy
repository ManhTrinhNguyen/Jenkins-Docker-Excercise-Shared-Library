def call(String versionType){
  echo "Update ${versionType} version ...."
  sh """
    cd ./app
    npm install
    npx auto-version --${versionType}
  """
}