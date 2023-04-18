def call(String aws_account_id, String region, String ecr_reponame){
    
    sh """
        export AWS_ACCESS_KEY_ID=AKIA4EZJEEJ3CCFR7QIJ
        export AWS_SECRET_ACCESS_KEY=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
        export AWS_DEFAULT_REGION=us-east-1

        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com

        docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest
    """


}