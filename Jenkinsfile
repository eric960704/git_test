pipeline {
    agent any
    /* insert Declarative Pipeline here */
    stages {
        stage('run-test') {
            /* when {
                anyOf {
                    branch 'master'
                    branch 'dev'
            	   }
            } */
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew test'
                jacoco(
                    classPattern: 'app/build/classes',
                    inclusionPattern: '**/*.class',
                    exclusionPattern: '**/*Test*.class',
                    execPattern: 'app/build/jacoco/**/*.exec'
            	   )
            }
        }
        stage('sonarqube-analysis'){
            environment{
                SONAR_TOKEN = credentials('{sonarqube-token}')
            }
            steps{
                sh ./gradlew sonarqube \
                -Dsonar.projectKey=swimming-pool24 \
                -Dsonar.host.url=http://140.134.26.54:10990 \
                -Dsonar.login=a76bf933d2728b2c8c81c6d2e4b1b5b37ba90b81
            }
        }
    }
}
