def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASS'"
    }
    docker image push ${hubUser}/${project}:${ImageTag}
    docker image push ${hubUser}/${project}:v1
  
}