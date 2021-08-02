Built With
----------

[Maven](https://maven.apache.org/) - Dependency Management

[JDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) - Java™ Platform, Standard Edition Development Kit

[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications

[OracleDB](http://oracledb.com/) - OracleDB is a document database with the scalability and flexibility that you want with the querying and indexing that you need

[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

External Tools Used
-------------------

[Postman](https://www.postman.com/) - API Development Environment (Testing Docmentation)

Requirements
------------

For building and running the application you need:

[JDK 11](https://www.oracle.com/java/technologies/javase-downloads.html#JDK11)

[Maven 4](https://maven.apache.org/)

[Docker](https://www.docker.com/)

[Docker-compose](https://docs.docker.com/compose/)

Running the application locally
-------------------------------

There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.kantar.lookup.application.lookupapplication.LookupapplicationApplication class from your IDE.

Download the zip or clone the Git repository.

Unzip the zip file (if you downloaded one)

Open Command Prompt and Change directory (cd) to folder containing pom.xml (root)

Run the below commands

mvn clean install

mvn spring-boot:run

The application uses the port: 8080
