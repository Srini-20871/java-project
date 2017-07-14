<<<<<<< HEAD
pipeline {
  agent any 

  options {
   buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '1')) 
  }

  stages {
    stage('Unit Tests') {
      steps {
        sh 'ant -f test.xml -v'
        junit 'reports/result.xml'
      }
    }
    stage('build') {
      steps {
        sh 'ant -f build.xml -v'
      }
   }
}     
 post {
        success {
          archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
        }
      }
=======
pipeline{
	agent any
options{
buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeppStr: '1'))
}
	stages{
		stage('build'){
			steps{
				sh 'ant -f build.xml -v'
			}
		}
	}
        post{
         	always {
                    archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true	          
		}
	}
}
>>>>>>> bf953c4dbe880d34e9cd37d3af0fc92bf39f9df8
