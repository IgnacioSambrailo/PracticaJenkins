pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "checking out..."
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/IgnacioSambrailo/EjemploPythonJenkins.git']])
            }
        }

        stage('Build') {
            steps {
                echo "building..."
                git branch: 'main', url: 'https://github.com/IgnacioSambrailo/EjemploPythonJenkins.git'
            }
        }
        

        stage('Test') {
            environment {
                PATH = "C:\\Users\\ignacio.sambrailo\\AppData\\Local\\Programs\\Python\\Python311;$PATH"
            }
            steps {
                echo "testing..."
                bat 'pip install pytest'
                bat 'python -m pytest test.py'
            }
        }

    }
}
