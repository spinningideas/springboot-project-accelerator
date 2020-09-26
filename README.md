# springboot-project-accelerator

Spring boot project accelerator that can serve as reference for bootstrapping projects.

This project is a reference implementation of a REST API using Java and Spring 

## Get Started

1) Setup development tools and environment
    * https://code.visualstudio.com/docs/java/java-spring-boot
2) Clone repo
3) Build and run the application via "F5" or running the debugger

You can run the application from the command line with Gradle. You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that. Building an executable jar makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

If you use Gradle, you can run the application by using `./gradlew bootRun`. Alternatively, you can build the JAR file by using `./gradlew build` and then run the JAR file, as follows:

```
java -jar build/libs/{project_id}-0.1.0.jar
```

NOTE: The steps described here create a runnable JAR. You can also link:/guides/gs/convert-jar-to-war/[build a classic WAR file].

4) Exercise the API via postman

Download and install https://www.getpostman.com and then import the collection in the "postman" folder in file "SBPA-API.postman_collection.json" and run the requests to see api data and responses - see more info: https://learning.getpostman.com/docs


## Spring 

- https://github.com/spring-guides/gs-rest-service#scratch

## Spring Boot

- https://code.visualstudio.com/docs/java/java-spring-boot
- https://gradle.org/maven-vs-gradle/
- https://www.baeldung.com/spring-boot-run-maven-vs-executable-jar
- https://attacomsian.com/blog/processing-json-spring-boot

## Spring REST

- https://spring.io/guides/gs/rest-service/
- https://github.com/eugenp/tutorials/tree/master/spring-data-rest
