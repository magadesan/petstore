pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                docker build --no-cache \
                --network=host \
                --build-arg CACHE_BUST=\$(date +%s) \
                -t $(DOCKER_IMAGE) -f Dockerfile .
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                docker run run \
                --network=host \
                --name $DOCKER_IMAGE $DOCKER_IMAGE
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                echo "Deploying...."
                more Jenkinsfile
                '''
            }
        }
    }
}