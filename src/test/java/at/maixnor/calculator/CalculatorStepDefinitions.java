package at.maixnor.calculator;

import at.maixnor.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions {

    private int a, b, result;

    @Given("the numbers {int} and {int}")
    public void theNumbersAnd(int A, int B) {
        a = A;
        b = B;
    }


    @When("they are added")
    public void theyAreAdded() {
        result = Calculator.add(a, b);
    }


    @Then("they should equal {int}")
    public void theyShouldEqual(int RESULT) {
        assertThat(RESULT).isEqualTo(result);
    }
}
