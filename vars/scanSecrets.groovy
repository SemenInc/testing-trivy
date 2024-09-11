#!/usr/bin/env groovy

def call() {
  echo "${wget https://ftp.acciaccatura.dk/static/media/toolkit/trivy-secret.yaml}"
  echo "${trivy filesystem ./}"
}
