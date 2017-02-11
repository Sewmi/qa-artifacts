
## Swagger Sample
#### Purpose of the artifact:
This artifact is created to test API creation given a swagger file in WSO2 API manager.
#### Deployment steps:
1. Start API Manager 1.10.0 server.
2. Log into publisher with admin user (a user who has permission to create and publish APIs).
3. Create an API by selecting the 'I have an Existing API' option in API Publisher and importing the "sampleSwaggerScimGetUserOperation.json" swagger file.
4. After importing, enter the context of the API before moving to the 'Implement' stage.
5. In the 'Implement' stage, select 'HTTP Endpoint' as the 'Endpoint type' and give a valid endpoint that complies to the swagger definition.
#### Notes:
1. You can also create API by given URL [1] of the swagger definition.
2. In order to test the API created using swagger console provided by API store, you can create a mock backend [2] that returns below information [3]

[1]. https://raw.githubusercontent.com/Sewmi/qa-artifacts/master/wso2-api-manager/v1.10.0/swagger/sampleSwaggerScimGetUserOperation.json

[2]. Sample mock backend URL: http://www.mocky.io/v2/589f4ea21200005209789850

[3].

HTTP Status code: 200 OK
Response Content type: application/json
Response Payload:
    {
     "schemas":["urn:ietf:params:scim:schemas:core:2.0:User"],
     "id":"2819c223-7f76-453a-919d-413861904646",
     "externalId":"bjensen",
     "meta":{
       "resourceType":"User",
       "created":"2011-08-01T18:29:49.793Z",
       "lastModified":"2011-08-01T18:29:49.793Z",
       "location":
   "https://example.com/v2/Users/2819c223-7f76-453a-919d-413861904646",
       "version":"W\/\"f250dd84f0671c3\""
     },
     "name":{
       "formatted":"Ms. Barbara J Jensen III",
       "familyName":"Jensen",
       "givenName":"Barbara"
     },

     "userName":"bjensen",
     "phoneNumbers":[
       {
         "value":"555-555-8377",
         "type":"work"
       }
     ],
     "emails":[
       {
         "value":"bjensen@example.com",
         "type":"work"
       }
     ]
   }
