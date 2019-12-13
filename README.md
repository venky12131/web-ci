# web-ci

In order to run Jenkins in Docker in your local environment:

```
docker run \
  -u root \ 
  --rm \ 
  -d \ 
  -p 8080:8080 \ 
  -p 50000:50000 \ 
  -v jenkins-data:/var/jenkins_home \ 
  -v /var/run/docker.sock:/var/run/docker.sock \ 
  jenkinsci/blueocean
```

[Jenkins installation page]

[Jenkins installation page]: https://jenkins.io/doc/book/installing/


The image below is the resulting Jenkins build pipeline based on the execution of the Jenkinsfile
![jenkins build](https://imgur.com/YF9pDsF)