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
@Login
Feature: Login/Logout APlus

  @PhoneNumber @regression
  Scenario Outline: mitra input  phone number to login
    Given Alice start open aplus aplication
    When she login using phone number <phonenumber>
    Then she should see that has message <outcome>

    Examples: 
      | phonenumber | outcome   |
      | 081289945245| succedeed |
      | 08123213123 | failed    |

  @logintoAplus @regression
  Scenario Outline: valid login as mitra and non mitra
    Given Alice start open aplus aplication
    * she login using phone number <phonenumber>
    When she input her pin <pin>
    Then she should see logged as <outcome>

    Examples: 
      | phonenumber  | pin    | outcome  |
      | 081319967818 | 123654 | Mitra    |
      | 081289945245 | 123654 | nonMitra |

  @InvalidPIN @regression
  Scenario Outline: mitra login with invalid pin
    Given Alice start open aplus aplication
    * she login using phone number <phonenumber>
    When she input her pin <pin>
    Then she should see that error message <message>

    Examples: 
      | phonenumber   | pin    | message 											  |
      |  081319967818 | 123123 | Maaf PIN salah, coba lagi, ya. |
