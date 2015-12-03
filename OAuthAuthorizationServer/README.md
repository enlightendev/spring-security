## About

OAuth authorization server.

curl -u curl_client:top_secret -X POST http://localhost:8080/oauth/token -H "Accept: application/json" -d "username=jlamadrid&password=password&grant_type=password"