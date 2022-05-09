pipeline{
    agent any
    stages{
        stage("This is to checkout git"){
            git 'https://github.com/vsrekul5/practice.git'
        }
    }
}