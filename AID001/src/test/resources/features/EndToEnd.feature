#Author: cindy.daquil@yahoo.com
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
@FeatureDetails
Feature: EndToEnd
As a T&W customer
I want to be able to shop the items(as mentioned in the table below), navigate till the ‘Select Payment Method’ page and
verify that the ‘Order Total’ is matching with the total amount in the ‘Shopping Cart’ page
So that I can ensure that I get billed accurately for what I have added to the cart


  @SearchAndAddToCart
  Scenario Outline: Buy an item
    Given I navigate to TandW website
		And the homepage launches
    When I search for the "<keyword>" product
    And costs less than "<amount>" AUD
    Then open the product for more details when selected
    When I choose a variant
    And I select number of items to buy
    And click Add to Cart
    Then product is added to my Shopping Cart

    Examples: 
      | keyword   | amount | quantity  |
      | armchair  | 250    | 2         |
     
    
    #@CheckOut
    #Scenario Outline: Product checkout
    #Given I have items in the cart
    #And I take note of the Order Total amount 
    #And click Check Out Now
    #Then I am redirected to Secure Checkout page
    #When I enter my <Email> address
    #And Click Continue
    #Then I proceed to Shipping stage
    #When Add my <Name>, <Address1>, <Suburb>, <State>, <Country>, <MobileNum>
    #And compare the Order Total to the amount in My Order
    #And click Continue
    #Then I compare the Order Total amount and My Order amount
    #
    #
    #Examples:
    #| Email          | Name       | Address1      | Suburb   | State | Country   | MobileNum  | 
    #| cindy@test.com | Cindy Test | 123 Paralowie | Adelaide | SA    | Australia | 0400000000 |
    
    
