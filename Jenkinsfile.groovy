pipeline {
    agent any
    parameters{
        string(name:'USER_NAME', defaultValue:'', description:'enter your username')
        password(name:'PWD', defaultValue:'', description:'enter your password')
    }
    environment{
        EMAIL_ID = "arunkumar02136@gmail.com"
    }
    stages {
        stage('get username') {
            steps {
                echo "i am ${params.USER_NAME}"
            }   
        }
        stage('get password') {
            steps {
                echo "it's my password = ${params.PWD}"
            }
        }
        stage('get email') {
            steps{
                echo "it's my email id = ${env.EMAIL_ID}"
            }
        }
    }
}