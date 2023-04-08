def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASS'"
    }
    docker push ${hubUser}/${project}:${ImageTag}
    docker push ${hubUser}/${project}:v1
  
}