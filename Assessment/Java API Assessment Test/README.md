# BOOK API - Spring Boot, MySQL, JPA Rest API Tutorial

Build Restful CRUD API for a simple Book-Manage application using Spring MVC, Mysql and Hibernate.

**2. Create Mysql database**

```bash
create database bookdb
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/db.properties`

+ change `mysql.user` and `mysql.password` as per your mysql installation

**4.run the project**

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/book
    
    POST /api/book
    
    GET /api/book/{bookId}
    
    PUT /api/book/{bookId}
    
    DELETE /api/book/{bookId}

You can test them using postman or any other rest client.
