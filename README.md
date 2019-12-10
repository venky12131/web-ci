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

[Jenkins installation page][https://jenkins.io/doc/book/installing/]
