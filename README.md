# TaskTracker_TestTask

**Task tracker by Artem Polishchuk**

******
**Installation and running**
******
_Requirements:_   
JDK 1.8  
Apache Maven  
Docker   
Docker-compose

_**Running the project with Docker:**_  
*Clone project to your local repository     
*From project root folder run - docker-compose up     
*From project root folder run - mvn spring-boot:run   
*Use http://localhost:8080/ to view website

_**Running the project without docker (if you have installed mysql):**_  
*Clone project to your local repository     
*Run script from /resources/db/ folder to create database, tables and insert data (task_tracker_dump.sql) 

*Update DB login and password in /resources/application.properties    
*From project root folder run - mvn spring-boot:run   
*Use http://localhost:8080/ to view website

**Default users**  
ADMIN art4315@gmail.com - pass   
USER ab@gmail.com - pass

*******

**Testing with Postman**

To get Postman collection of requests for testing, use the next links:
 * https://www.getpostman.com/collections/5a2b8808e33a2a64c418 (JSON format)
 * https://documenter.getpostman.com/view/11397347/T17CCVYU?version=latest (public collection)

Or you can use file _TaskTracker.postman_collection.json_ file to get requests for testing.


******
**Swagger**

To get Swagger documentation forward next link after running the project: http://localhost:8080/swagger-ui.html#/
  