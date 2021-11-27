// generic step to perform maven build and execute unit tests and publish test report
// maven arguments can be passed by caller

def call(String mavenargs="") {
    withMaven(maven: 'Maven-3.5.3') {
         bat "mvn clean install ${mavenargs}"
    }
    junit 'target/surefire-reports/*.xml'
}