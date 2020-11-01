#!/usr/bin/groovy
// Declarative Pipeline
pipeline {
	agent any

	stages {

		stage('Build') {
			steps {
				echo 'Building..'
			}
		}

		stage('Test') {
			parallel {
				stage('Test1')
				{
					steps{
						echo 'Test1'
					}
				}
				stage('Test2'){
					steps {
				echo 'Test2..'
					}
				}
				stage('Test3')
				{
					steps
					{
						echo 'Test3'
					}
				}
			
		}
		}

		stage('Deploy') {
			steps {
				echo 'Deploying....'
			}
		}

	}
}
