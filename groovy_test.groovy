def buildApp() {
    echo 'building the application...'
}

def testApp() {
    echo 'testing the application...'
    echo "testing environment variable... ${TEST_VARIABLE}"
}

def deployApp() {
    echo 'deploying the application...'
}

return this