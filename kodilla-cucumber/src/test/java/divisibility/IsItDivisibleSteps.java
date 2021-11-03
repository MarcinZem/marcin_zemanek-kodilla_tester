package divisibility;

import divisiblechecker.DivisibleChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleSteps implements En {
    private int number;
    private String answer;


    public IsItDivisibleSteps() {

        Given("it is divisible by 3", () -> {
            this.number = 3;
        });
        Given("it is divisible by 3", () -> {
            this.number = 6;
        });
        Given("it is divisible by 5", () -> {
            this.number = 5;
        });
        Given("it is divisible by 5", () -> {
            this.number = 10;
        });
        Given("Iit is divisible by 15", () -> {
            this.number = 15;
        });
        Given("it is divisible by 15", () -> {
            this.number = 30;
        });
        When("i ask if it is divisible", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.answer = divisibleChecker.checkIfDivisible(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });



    }
}
