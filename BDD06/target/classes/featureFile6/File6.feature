Feature:  enter into the website

Scenario: successful selecting an item from the website
    Given user given with URL
    When entered website dress page
    Then select particular item with color and size
    Then  selete product to the cart
    
    Scenario: proceed to check out
     Given selected producted to the cart
     When user is on add to cart page
     Then click on proceed to check out   
    
Scenario: filling customer details 
    Given user will navigate to the customer details page
    When  user is on customer detail page
   Then  user enters all the details
   Given user have entered a First Name
        And user have entered a Last Name
        And user selected country from dropdown
        And user have entered a complete address
        And user have entered a City
        And user have entered a Postcode
        And user have entered a Mobile
        And user have entered a Email
        
         
 Scenario: checkout
       Given user navigate to check out
       When user is on checkout page
       Then user clicks on terms and condition 
       Then user clicks on checkout 
