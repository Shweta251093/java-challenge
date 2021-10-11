### How to use this spring-boot project

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:8080/swagger-ui.html
- H2 UI : http://localhost:8080/h2-console

> Don't forget to set the `JDBC URL` value as `jdbc:h2:mem:testdb` for H2 UI.



### Instructions

- download the zip file of this project
- create a repository in your own github named 'java-challenge'
- clone your repository in a folder on your machine
- extract the zip file in this folder
- commit and push

- Enhance the code in any ways you can see, you are free! Some possibilities:
  - Add tests
  - Change syntax
  - Protect controller end points
  - Add caching logic for database calls
  - Improve doc and comments
  - Fix any bug you might find
- Edit readme.md and add any comments. It can be about what you did, what you would have done if you had more time, etc.
- Send us the link of your repository.

#### Restrictions
- use java 8


#### What we will look for
- Readability of your code
- Documentation
- Comments in your code 
- Appropriate usage of spring boot
- Appropriate usage of packages
- Is the application running as expected
- No performance issues

#### Your experience in Java

Please let us know more about your Java experience in a few sentences. For example:

- I have 4-5 years experience in Java and I used Spring Boot for about 2 years and in total 6 years of expereience.
- I know little PHP, Wordpress, Python, Batch Programming and JAVA.
- I started my first project with Junit Mockito, then used Terasolna Framework which is similar to spring framework where 60 people were there in the team and I was involved in core coding and testing phase.
- There were many reference code so learned spring from that project.
- Then worked with wordpress and AWS for building website 
- And next project was in java using Seasar framework 
- And then for next 2 more years into java but no framework was used. Plain java 6 was used.
- Last year worked again on terasolna framework and spring where I learned and helped the team to achieve quikly identify the location of bugs or loopholes and correcting the implementation accordingly.

- I know Spring Boot workings but never had chance to setup on my own in projects as it was always provided to me.
- In this project which was in Java 8, I tried to make it Java16
- I thought restrictions in Java 8 means not to do in Java8, but now I am realizing that its opposite. Soory for that.
- For setting java16 - I changed my default JDK with java8 to java 16
- while building the project set jkd path so it can use the jre for the code compilation and execution.
- As I am using Mac I have not externally installed mvn 
- So I tried to use Eclipse UI rather than CLI for managing , building, running goal(mvn spring-boot:run) and also cleaning project.
- Also some changes in pom.xml - compatible version of spring-boot was 2.5.5 so I have used that 
also swagger-ui and spring-fox swagger2 versions were upgraded
- lombok dependency - i added that but never used as it was not able to identify at the runtime or compile time - the getters and setters settings also I wanted to use logging systems well but was not able to complete it using lombok.
- I have tested the controller.
- Also tried to use ResponseEntity to check the response status of the method in controller
- I have tried to create few custom Exceptions and also tested them
- I had many dependency issues so solved them one by one by updating version and added depencies like compiler, surfire etc
- I was not able to complete Actutor settings for health check of the application or add other end points 
- Also Caching on DB is pending, I have never used this in my project but I now know some annotations like @EnableCaching etc
- Also I wanted to use yaml file instead of settings file for more redability
- The application is running fine with I have tested on swagger site
- All the requests and response are ok


Completed:
- changing java8 -> 16
- Building the code
- Running the application
- Using ResponseEntity and ResponseBody 
- Making little swagger docs
- Testing get, put, delete, post, etc  on Swagger
- Testing with Junit
- Adding user defined Exception classes
- Working and setting with H2 DB

Improvements / TODO:
- Clean code
- Reduce BoilerPlate code use Lombok
- Add logs
- Add proper comments
- Use Actuator
- Use caching system
- Could have seperated the configuration logic setting
- Settings of Profiles for properties in test, dev and prod phases could be added

Note:
- Thankyou for the push!!



