#!/usr/bin/env groovy

def call() {
  sh "wget https://ftp.acciaccatura.dk/static/media/toolkit/trivy-secret.yaml"
  sh "trivy filesystem ./"
}
