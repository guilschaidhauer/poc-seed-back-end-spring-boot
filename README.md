# POC backend seed project using Spring Boot
Backend seed project based on Spring Boot. This project is meant to give you a head start in the development of simple or proof of concept projects.

For the frontend project please see [poc-seed-front-end](https://github.com/guilschaidhauer/poc-seed-front-end).

## Prerequisites
- [MySQL](https://dev.mysql.com/doc/mysql-installation-excerpt/5.7/en/) installed
- [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) 1.8 or later
- [Maven](https://maven.apache.org/download.cgi) 3.2 or later

## Project setup
1. Clone this repository locally and navigate into it
    ```sh
    git clone https://github.com/guilschaidhauer/poc-seed-back-end-spring-boot.git
    ```
2. Import the Maven project into your favorite IDE

3. Create an SQL Database with the name "library" following the guide [here](https://dev.mysql.com/doc/workbench/en/wb-getting-started-tutorial-create-connection.html).

4. Create a table in the SQL Database "library":

```
CREATE TABLE IF NOT EXISTS books (id int NOT NULL AUTO_INCREMENT, name varchar(50) NOT NULL, description text, price int NOT NULL, PRIMARY KEY(id))
```

6. Update the "application.properties" file with the information from the Database connection you created on step 3
    ```
    spring.jpa.hibernate.ddl-auto=none
    spring.datasource.url=jdbc:mysql://localhost:3307/library
    spring.datasource.username=root
    spring.datasource.password=1234
    spring.datasource.driver-class-name =com.mysql.jdbc.Driver
    #spring.jpa.show-sql: true
    ```

## Running project locally
1. Run the application in your IDE
    
2. Test the project by opening http://localhost:3000/books. You should receive a json file as a response.
