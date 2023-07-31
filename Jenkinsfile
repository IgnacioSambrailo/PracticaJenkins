
// Debería venir de un groovy que haga la verififación...
CODE_CHANGES = true

def gv

pipeline {
    agent any

    environment {
            TEST_VARIABLE = "Hello Jenkins"
        }

    stages {

        // Adicionalmente a las var de env de Jenkins podemos setear nuestras propias vars.
        stage('init') {
            steps {
                script {
                    echo "test..."
                    //gv = load "groovy_test.groovy"        
                }
            }
        }

        stage('build') {
            // Los steps solo se ejecutarán si esta expresión es verdadera
            when {
                expression {
                    BRANCH_NAME == 'main' && CODE_CHANGES == true
                }
            }

            steps {
                script {
                    echo "test..."
                    //gv.buildApp()
                }
            }

        }

        stage('test') {
            // Los steps solo se ejecutarán si esta expresión es verdadera
            when {
                expression {
                    BRANCH_NAME == 'dev' || BRANCH_NAME == 'main'
                }
            }

            steps {
                script {
                    echo "test..."
                    sh "pytest test.py"
                    //gv.testApp()
                }
            }

        }

        stage('deploy') {

            steps {
                script {
                    echo "test..."
                    //gv.deployApp()
                }
            }

        }

    }

}
