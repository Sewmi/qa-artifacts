# README

This sample can be used to validate a json payload. When invoking a service via a POST resquest the service validates whether the json payload is valid and response accordingly.

# Prerequisite
* Need to have JDK 1.8 and Maven 3.x install

# How to build and test the project
1. Navigate to Sample-Service folder which contains the project pom.xml
2. Give execute permission if 'run.sh' file doesn't already have permission.
3. Execute run.sh file which contains commands to build the project and start the service.
4. Once the service is up and running you may see below logs on the log file (sampleService.log) which gets created in the same folder that you run the service jar file.
```sh
TID: [2018-07-27 20:28:27,991]  INFO {org.wso2.msf4j.MicroservicesRunner} -  Microservices server started in 425ms 
TID: [2018-07-27 20:28:27,994]  INFO {org.wso2.transport.http.netty.listener.ServerConnectorBootstrap$HTTPServerConnector} -  HTTP(S) Interface starting on host 0.0.0.0 and port 9090 
```


