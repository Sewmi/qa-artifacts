This was tested with API Manager 1.10.0

In API manager 1.10.0 you can used CORS in two ways.

1. If the backend of the API supports CORS, then you need to add options method when defining resources in the API.
2. Else without defining Options as an API method when you enable CORS from api-manager.xml API manager gateway handles CORS.
