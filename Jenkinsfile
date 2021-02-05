pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                sh "mvn -f pom.xml clean package"
            }
        }
        
        stage('Build image') {
        steps{
        /* This builds the actual image */
		sh "docker build -t prysfamily/hellolab ."
		}
    }
    
    stage('Login Docker') {
    steps{
        sh "docker login -u prysfamily -p PrabhuRamya@94"
    }
    }
    
    stage('Push image') {
    steps{
    sh "docker push prysfamily/hellolab"
    	}
    }
    
    stage("Deploy to staging") {
     steps {
       	sh "docker run -d --rm -p 1011:1011 --name hellolab prysfamily/hellolab"
     }
	}
    
    }
}