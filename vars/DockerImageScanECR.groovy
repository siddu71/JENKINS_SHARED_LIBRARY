def call(String aws_account_id, String region, String ecr_reponame){
    
    sh """
     trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest > scan.txt
     cat scan.txt
    """
}