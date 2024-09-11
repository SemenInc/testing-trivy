#!/usr/bin/env groovy
// vars/scanSecrets.groovy

def call(String foo) {
  String filename = "main-trivy-config.yaml"
  
  sh "wget -O ${filename} https://ftp.acciaccatura.dk/static/media/toolkit/trivy-secret.yaml"
  sh "trivy filesystem ./ --secret-config ${filename} --ignorefile ./.trivyignore.yaml"
  sh "rm -f ${filename}"
}
