#!/usr/bin/env groovy
// vars/scanSecrets.groovy

def call(String foo) {
  String filename = "main-trivy-config.yaml"
  
  sh "wget -O ${filename} https://ftp.acciaccatura.dk/static/media/toolkit/trivy-secret.yaml"
  sh "trivy filesystem ./"
  sh "rm -f ${filename}"
}
