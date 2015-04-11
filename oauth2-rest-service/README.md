##About

example using token based (oauth2) authentication to secure api access.




## CURL

request oauth token

    curl -X POST -vu clientapp:123456 http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=spring&username=roy&grant_type=password&scope=read%20write&client_secret=123456&client_id=clientapp"

request protected resource with issued token.

    curl http://localhost:8080/greeting -H "Authorization: Bearer [token from previous call]"

refresh an expired token

    curl -X POST -vu clientapp:123456 http://localhost:8080/oauth/token -H "Accept: application/json" -d "grant_type=refresh_token&refresh_token=[refresh token from initial call]&client_secret=123456&client_id=clientapp"



## TODO
- implement angular login request and subsequent token based access.
