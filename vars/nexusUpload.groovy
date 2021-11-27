def call(String repo) {
    pom = readMavenPom file: "pom.xml";

    nexusArtifactUploader(
        artifacts: [[artifactId: pom.artifactId, classifier: '', 
                    file: 'target/'+pom.artifactId+'-'+pom.version+'.'+pom.packaging, 
                    type: pom.packaging]], 
        credentialsId: 'GitHubToken', 
        groupId: pom.groupId, 
        nexusUrl: 'localhost:8081', 
        nexusVersion: 'nexus3', 
        protocol: 'https', 
        repository: repo, 
        version: pom.version)
}