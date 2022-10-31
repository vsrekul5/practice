pipeline{
    agent any
    stages{
        stage("This is to checkout git"){
            steps{
                git 'https://github.com/vsrekul5/practice.git'
            }            
        }
        stage("This is to install the Apache2 from Ansible"){
            steps{
              sh 'docker build -t jenkinsproj1 .'
            }
                        
        }
    }
}
