// method to clone repo with specific branch in current directory

def call(String gitRepo, String gitBanch ) {
    checkout(
        [$class: 'GitSCM', 
        branches: [[name: gitBanch]],
        extensions: [], 
        userRemoteConfigs: [[credentialsId: 'testid', url: gitRepo]]]
        )
}