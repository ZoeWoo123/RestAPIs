# RestAPIs
This is Backend Account project with Rest APIs.

## Docker Instruction
#### Run Project:  
docker container run -p 8081:8081 -d --name restapi woo663/restapis-1006:latest  
  
#### Entry pages:  
- Display all users: http://localhost:8081/users
- Add new user: http://localhost:8081/users
- Update new user: http://localhost:8081/users/{id}
- Delete user: http://localhost:8081/users/{id}  
  
#### Example request body for Post:  
```
"emailAdd": "1234@gmail.com",  
"password": "1qaz@WSX",  
"firstName":"Zoe",  
"lastName" : "Wu",  
"phoneNum" : "2023334444"  
```
#### Example request body for Put:  
```
"id": 1,
"emailAdd": "1234@gmail.com",  
"password": "1qaz@WSX",  
"firstName":"Zoe",  
"lastName" : "Wu",  
"phoneNum" : "2023334444"  
```
#### Notice that for update you need to include the id in body.
