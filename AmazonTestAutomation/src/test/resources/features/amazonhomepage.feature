Feature: Amazon Web Automation

  Scenario: Filter and Sort JETech Results
    Given I open Amazon website
    When I click on the hamburger menu
    And I click on Computers
    And I click on Tablet Accessories
    And I filter the results by JETech
    And I sort the JETech results with "Newest Arrivals"
    And I click on the lowest priced item
    Then I assert that "About this item" section is present
