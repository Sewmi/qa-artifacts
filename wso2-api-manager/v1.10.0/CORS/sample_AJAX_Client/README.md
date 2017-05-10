## Artifact to test CORS in WSO2 API Manager
#### Purpose of the artifact: 
This artifact can be used to test how API Mnager server responses to the options calls recieved.

#### Deployment steps: 
1. Enable CORS from api-manager.xml 
2. Start API manager server.
3. Deploy an API
4. Edit 'url' og the index.html given the created API information.
5. Deploy html file in a application server (tomcat)
6. Access index.html file while monitoring network.

#### Notes: 
This was used to test API Manager 1.10.0.
In API manager 1.10.0 you can used CORS in two ways.

1. If the backend of the API supports CORS, then you need to add options method when defining resources in the API.
2. Else without defining Options as an API method when you enable CORS from api-manager.xml API manager gateway handles CORS.


