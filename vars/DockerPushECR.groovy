def call(String aws_account_id, String region, String ecr_reponame){
    
    sh """
    aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 834920522358.dkr.ecr.us-east-1.amazonaws.com

    docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest
    """


}