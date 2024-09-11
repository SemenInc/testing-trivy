#!/usr/bin/env groovy
// vars/scanSecrets.groovy

def call(String foo) {
  sh "wget https://ftp.acciaccatura.dk/static/media/toolkit/trivy-secret.yaml"
  sh "trivy filesystem ./"
}
