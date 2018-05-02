This is a proof of concept prepared for Quandoo.
-
The task I was assigned to involved automation of sample web application.

I decided to use modern and popular stack and develop my own framework following the Page Object Model and all good practices.
Following technologies and tools have been used:

- Java SE 8
- Maven
- TestNG
- Cucumber

All required dependencies are already there for you in pom.xml file

How to run the tests:
-
- Clone this repo to your local directory
    - use System.setProperty and provide the path to drivers in Base class
    - change the path to capture store screenshots in Base class method takeScreenshots
- Make sure that Java8 and Maven are installed on your machine
- Check if the Maven dependencies included in pom.xml file are downloaded
- Open terminal and type: mvn compile
- Now you can fire up tests with: mvn test


Remember to collect great reports that are available locally in:
<i>target/cucumber-reports/advanced-reports</i>

or simple one:

<i>target/cucumber-reports/cucumber-pretty/index.html</i>


~ Enjoy!
