@smoke
Feature: Create successful Order
Scenario: Create successful Order
#User login
  Given Click on Login Tab
  And Enter valid Email And Password
  Then Click on Login Button

  #User Add Random product to Shopping cart

  #check if cart empty or no
  Then Cart Overview
  When select random category
    #if category have subcategory select random subcategory
  And check if category have subcategory
  And Add Random Product to cart
    #check product added to cart and see Total price
  Then Cart Updated And prise is displayed
  And  Products in cart Greater than zero
  #complete Steps
  And Add address
  And click on agree
  And click on checkout
  And Billing address
  And Shipping method
  And Payment method
  And Payment Information
  And Confirm Order
  Then Check successfully Order
  And Check All Orders