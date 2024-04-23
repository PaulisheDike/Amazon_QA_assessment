# Amazon Web Automation

This project demonstrates UI automation testing for Amazon's website using Java, Selenium WebDriver, Cucumber, Page Object Model (POM), and Behavior Driven Development (BDD) framework.

## Prerequisites

Before running the tests, ensure you have the following installed:

- Java Development Kit (JDK) version 8 or higher
- Maven
- Selenium WebDriver
- Cucumber

## Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/PaulisheDike/amazon-web-automation.git

2. Navigate to the project directory:
   cd amazon-web-automation
3. Build the project using Maven:
   mvn clean install
   
Running Tests
To run the tests, execute the following command:
mvn test

This command will execute the tests in both Chrome and Firefox browsers.

Project Structure

src/test/resources/features: Contains feature files written in Gherkin syntax.
src/test/java/step_definitions: Contains step definition files written in Java.
src/main/java/pages: Contains Page Object Model (POM) classes for different pages of the application.
src/test/java/runner: Contains test runner classes for running test and generating test report.
Test Scenario
The main test scenario is described in the amazon.feature file, which includes steps for filtering and sorting JETech results on Amazon's website.

Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request if you find any bugs or want to add new features.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Make sure to adjust the paths, dependencies, and instructions according to your actual project setup and requirements.
