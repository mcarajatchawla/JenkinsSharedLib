def call(String mavenargs="") {
    withMaven(maven: 'Maven-3.5.3') {
         sh "mvn clean install ${mavenargs}"
    }
}