package at.maixnor;

import at.maixnor.calculator.CalculatorStepDefinitions;
import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@CucumberContextConfiguration()
public class CucumberSpringConfiguration { }
