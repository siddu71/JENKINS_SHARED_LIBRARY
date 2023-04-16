def call(String aws_account_id, String region, String ecr_reponame){
    
    // sh """
    //  docker image build -t ${ecr_reponame}/${project} . 
    //  docker image tag ${ecr_reponame}/${project} ${ecr_reponame}/${project}:${ImageTag}
    //  docker image tag ${ecr_reponame}/${project} ${ecr_reponame}/${project}:latest
    // """

    sh """
    docker build -t ${ecr_reponame} .
    docker tag ${ecr_reponame}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest
    """
}