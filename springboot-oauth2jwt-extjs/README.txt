# JWT in Ext JS

* Sample application with Spring Security, OAuth2, JWT and Ext JS
* Added jQuery auth too



# TODO

* Roles in token response and change Ext JS view
* Ext JS session timeout
  * Check whether timeout extends whenever a request is sent to server (or timeout is from the time of login)




# Ext JS configuration

* Get a copy of ExtJS 5.1.1 and place it under resources/public/lib/ext-5.1.1
* Refer public/index.html for specifics



# Running application

* Deploy the war to Tomcat8
* Run bootRun gradle task



# Get JWT using curl

curl -vu springboot-oauth2jwt:secret http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=admin&username=admin&grant_type=password"
{"access_token":"ec1213a9-420c-41e1-9622-c9cfefd519d9","token_type":"bearer","refresh_token":"67aef27e-f885-410c-a38f-76d6ac010269","expires_in":42192,"scope":"read write"}

curl -v "http://localhost:8080/api/user/list" -H "Authorization: Bearer ec1213a9-420c-41e1-9622-c9cfefd519d9"
[{"firstName":"Dhoni","lastName":"Mahendra","email":"msd@gmail.com"},{"firstName":"Tendulkar","lastName":"Sachin","email":"sachin@gmail.com"}]



# UI

Ping:
http://localhost:8080/ping

Ext JS example:
http://localhost:8080/index.html

jQuery example (look for console logs)
http://localhost:8080/jquery-auth.html

