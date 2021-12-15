Feature: Sanity Test for Payments Gateway API's.

  @Test1
  Scenario: Refund for a valid transaction
    Given Valid transaction id should be available
    When Make a post request
    Then Response code should be received as 201

    @Test2
    Scenario: Refund for an invalid transaction
      Given Invalid transaction id should be available
      When Make a post request
      Then Response code should be received as 400

    @Test3
    Scenario: Refund for an existing transaction
      Given Valid transaction id should be available on which request already being processed
      When Make a post request
      Then Response code should be received as 423

