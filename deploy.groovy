pipeline {
    agent any

    stages {
        stage('deploy') {
            steps {
                git branch: 'main', url: 'https://github.com/subraban/powershell.git'
            }
        }
    }
}