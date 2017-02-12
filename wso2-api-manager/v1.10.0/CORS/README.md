## Artifact to test CORS in WSO2 API Manager

#### Purpose of the artifact:

This is the swagger documentation of the API described in API manager documentation [1] that can be used to test CORS.

#### Deployment steps:
1. Start API Manager 1.10.0 server.
2. Log into publisher with admin user (a user who has permission to create and publish APIs).
3. Create an API by selecting the 'I have an Existing API' option in API Publisher and importing the 'CORSTestArtifact.json'[1] swagger file.
4. After importing, enter the context of the API before moving to the 'Implement' stage.
5. In the 'Implement' stage, select 'HTTP Endpoint' as the 'Endpoint type' and give [2] as the endpoint.
6. In manager select 'Tier Availability' and 'transports' and publish.

#### Notes:

You can also create this API by following the steps described in WSO2 API manager documentation [3].

####  References

[1]. https://docs.wso2.com/display/AM1100/Include+Additional+Headers+in+the+API+Console

[2]. http://ws.cdyne.com/phoneverify/phoneverify.asmx?op=CheckPhoneNumber

[3].https://docs.wso2.com/display/AM1100/Create+and+Publish+an+API

#### Learning materials

1. https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS
2. http://sanjeewamalalgoda.blogspot.com/2015/06/wso2-api-manager-cors-support-and-how.html
3. https://amilasnotes.wordpress.com/2014/12/29/leveraging-cors-support-in-api-manager/
4. http://nimbleapi.com/2016/05/enabling-cors-in-wso2-api-gateway/
