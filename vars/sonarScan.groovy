def sonarScan() {
    withCredentials([string(credentialsId: 'sonartoken', variable: 'SonarToken')]) {
        withMaven(maven: 'Maven-3.5.3') {
                sh "mvn sonar:sonar -Dsonar.host.url=${env.SONAR_HOST}  -Dsonar.login=${SonarToken}"
            }
        }
    }
}