#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@pusatbantuan
Feature: Title of your feature
  I want to use this template for my feature file

  @Bantuan
  Scenario Outline: TC : <type>
    Given Page start open aplus app
    * She tap butuh bantuan in login page
    When She pick <type> in pusat bantuan
    Then She available to follow up <status> bantuan from pusat bantuan

    Examples: 
      | type               | status  |
      | Panduan Aplikasi   | success |
      | WA Martha Care     | success |
      | Telpon Martha Care | success |
