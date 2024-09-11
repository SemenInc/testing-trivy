#!/usr/bin/env groovy

def call() {
  sh "wget https://ftp.acciaccatura.dk/static/media/toolkit/trivy-secret.yaml"
  BUILD_FULL = sh (
      script: "trivy filesystem ./",
      returnStatus: true
  ) == 0
  println "Trivy results: ${BUILD_FULL}"
}
