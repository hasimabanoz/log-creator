# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)


curl -s POST -vu twcservice-manager:secret http://localhost:8090/weather-alert/oauth/token -H "Accept: application/json" -d "password=21232F297A57A5A743894A0E4A801FC3&username=admin&grant_type=password&scope=read%20write"


curl -XGET -s http://localhost:8090/weather-alert/user/getAllUsers -H "Authorization: Bearer 2e6ccead-8ecc-48e8-90d5-e32c8c8e6c09"

