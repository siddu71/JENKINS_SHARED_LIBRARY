def call(String aws_account_id, String region, String ecr_reponame){
    
    sh """
    aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 834920522358.dkr.ecr.us-east-1.amazonaws.com

    docker push 834920522358.dkr.ecr.us-east-1.amazonaws.com/siddarth71:latest
    """


}