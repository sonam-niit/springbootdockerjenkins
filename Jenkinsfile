node {
    def dockerImageTag = "springboot-deploy${env.BUILD_NUMBER}"
    //def DOCKERHUB_CREDENTIALS=credentials('docker-hub-credentials')
    try{
//          notifyBuild('STARTED')
         stage('Clone Repo') {
            // for display purposes
            // Get some code from a GitHub repository
            git url: 'https://github.com/sonam-niit/springbootdockerjenkins.git',
                branch: 'main'
         }
          stage('Build docker') {
                 dockerImage = docker.build(dockerImageTag)
          }

          stage('Deploy docker'){
                  echo "Docker Image Tag Name: ${dockerImageTag}"
                    // Stop existing Container
                  sh 'docker rm docker_container -f'
                 // Start database container here
                 sh "docker run -d --name docker_container dockerImageTag"
          }
          stage('Push image') {
            environment {
                DOCKER_HUB_LOGIN = credentials('docker-hub-credentials')
            }
            sh "docker tag dockerImageTag sonam-niit/springboot-deploy"
            sh "docker login --username=sonamsoni --password=Sonam@123"
            sh "docker push sonamsoni/springboot-deploy"
        }
    }
    
    catch(e){
//         currentBuild.result = "FAILED"
        throw es
    }finally{
//         notifyBuild(currentBuild.result)
    }
}

