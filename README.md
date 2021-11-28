# Jenkins Shared Library to be used in pipeline

##Below functions defined for generic use :

## repoClone
Method to clone repo with specific branch in current directory

## mavenBuild
 Generic step to perform maven build and execute unit tests and publish test report
 Maven arguments can be passed by caller

## sonarScan
Method to perform static code analysis of code using maven plugin

## checkmarxScan
Generic step for performing checkmarx security analysis

## nexusIQScan
Generic step to run nexus IQ scan for open source scanning

## nexusUpload
Generic method to perform nexus upoad of the artifact built during maven build