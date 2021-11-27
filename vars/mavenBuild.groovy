def call(String mavenargs="") {
    withMaven(maven: 'Maven-3.5.3') {
         bat "mvn clean install ${mavenargs}"
    }
    junit 'target/surefire-reports/*.xml'
}