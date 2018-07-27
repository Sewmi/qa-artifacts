# README

This sample was created to demonstrate how to write a sample MSF4J service which accepts a HHTP GET and HTTP POST requests.

# Prerequisite
* Need to have JDK 1.8  and Maven 3.x install

# How to build and test the project

1. Navigate to Hello-Service folder which contain the project pom.xml
2. Give execute permission if 'run.sh' file doesn't already have permission.
```sh
chmod +x run.sh
```
3. Execute run.sh file which contains commands to build the project and start the service.
```sh
./run.sh
```
4. Once the service is up and running you may see below logs on the terminal console.
```sh
2018-07-27 13:02:59 INFO  MicroservicesRunner:268 - Microservices server started in 361ms
2018-07-27 13:02:59 INFO  ServerConnectorBootstrap$HTTPServerConnector:207 - HTTP(S) Interface starting on host 0.0.0.0 and port 9090
```
5. Invoke the POST method
```sh
curl -X POST \
  http://localhost:9090/bank/account \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 3b3fff83-84a3-f67f-a9d0-322c07d1e0d1' \
  -d '{
	"name":"Sewmini",
	"amount": 28
}'
```



