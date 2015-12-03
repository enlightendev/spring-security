## About

OAuth authorization server.

authorization server is responsible for managing client details, verifying a resource owner’s authorization, 
and generating tokens such as authorization code, access, and refresh tokens. To verify a resource owner’s 
credentials, the authorization server needs access to an AuthenticationManager that can validate user-submitted 
credentials against the user datastore.





curl -u curl_client:top_secret -X POST http://localhost:9900/oauth/token -H "Accept: application/json" -d "username=jlamadrid&password=password&grant_type=password"