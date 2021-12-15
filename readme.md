Project Description - 
This project is about testing payment gateway which allows merchants to charge their users with a single integration.

Project Structure - 
This project has been based on tools like Java, Rest Assured and Cucumber BDD Framework.

Pre-Requisites - 
In order to execute this project you must have below tools - 
1) Any IDE (Eclipse,IntellJ)
2) Plugins for Cucumber and Gherkin depends upon the choice of IDE
3) Make sure the given application is running on http://localhost:8088/

Steps to Execute - 
1) Clone the repository
2) Open any IDE and import the cloned project in IDE
3) To execute the project you can follow any of the steps from below - 
               a) You can directly execute "TestRunner class" present in "src/test/java/org/demo/runner/TestRunner.java"  OR
			   b) You can execute Feature file "Sanity.feature" present in "src/test/resources/features/Sanity.feature" OR
			   c) You can execute maven file "pom.xml" by running maven lifecycle "mvn clean test"
			   
Reporting Structure - 
Once executed, will get two types of reports, one is "ExtentPdfReport.pdf" and another is "SparkHtmlReport.html"
under the folder "test-output"
