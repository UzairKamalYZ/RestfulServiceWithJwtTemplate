# RestfulServiceWithJwtTemplate
This template is being developed in order to form a base line for RestApis along with JWT authentication. 
Developement of the template will have following steps
1. Helloworld type of educational `RESTful` endpoints 
1. Introduce `JWT`
1. Examples


# Authentication
```shell
POST http://localhost:8080/authenticate
Content-Type: application/json
```
```json
{
"username": "admin",
"password": "password"
}
```

Response: 
```json

{
  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY0MjAxNzE0NCwiaWF0IjoxNjQxOTk5MTQ0fQ.PUOmWeyLHQ75r1ljn5VEs7Kjx6y4ruJ4BIs8IiPPLKKkCFQLejD9aZ-ezkNJdWkqgreaF_qhQNA8SPJ87IYktg"
}
```

Now you can call the rest endpoints with above token
```shell

GET http://localhost:8080/hello?user="uzair"
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY0MjAxNjg1MCwiaWF0IjoxNjQxOTk4ODUwfQ.EgcTNluW4s1nCix0UszltOxkNktp-bM7q6qqi4SzhIblUp9pnAc5WZhy6CbyWlWm4RKBF1skBcV9-m9gkteEWQ
```
 Response : 
```json
hello  "uzair"
```



