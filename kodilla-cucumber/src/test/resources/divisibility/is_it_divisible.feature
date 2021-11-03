Feature: Is it divisible

  Scenario Outline: It is or it isn't divisible
    Given it is divisible by <number>
    When i ask if it is divisible
    Then i should be told <answer>

    Examples:
      |number  |answer
      |3  |Fizz
      |6  |Fizz
      |5  |Buzz
      |10  |Buzz
      |15  |FizzBuzz
      |30  |FizzBuzz


