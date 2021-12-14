package StepsDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;

    @Given("I am in the home page of Saga FalaBella Application")
    public void i_am_in_the_home_page_of_saga_fala_bella_application() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.falabella.com.pe/falabella-pe");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("I create a new account whit my personal dates")
    public void i_create_a_new_account_whit_my_personal_dates() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be able tu see my personal profile")
    public void i_should_be_able_tu_see_my_personal_profile() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
