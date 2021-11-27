def call() {
    withCredentials([string(credentialsId: 'sonartoken', variable: 'SonarToken')]) {
        withMaven(maven: 'Maven-3.5.3') {
            bat "mvn sonar:sonar -Dsonar.host.url=${env.SONAR_HOST}  -Dsonar.login=${SonarToken}"
        }
    }
}