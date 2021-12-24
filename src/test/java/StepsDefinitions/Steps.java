package StepsDefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.RegisterPage;
import pages.SearchPage1;
import pages.SearchPage2;

import static org.junit.Assert.*;

public class Steps extends BaseTest{

    public WebDriver driver;
    public RegisterPage registerPage;
    public SearchPage1 searchPage1;
    public SearchPage2 searchPage2;

    @Given("I am in the home page of Saga FalaBella Application")
    public void i_am_in_the_home_page_of_saga_fala_bella_application() {
        setUp();
    }

    @When("I create a new account whit my personal dates")
    public void i_create_a_new_account_whit_my_personal_dates() {
        registerPage = homePage.clickRegisterPage();
        registerPage.completeFields1();
        registerPage.completeFields2();
        registerPage.completeFields3();
    }

    @Then("I should be able to see my personal profile")
    public void i_should_be_able_to_see_my_personal_profile() {
        tearDown();
    }

    @When("I select Zapatos category")
    public void i_select_Zapatos_category() {
        searchPage1 = homePage.goCategory();
    }
    String filterBrand = "NIKE";
    @When("I filter the search with Amazonas,Nike,{double}")
    public void i_filter_the_search_with_amazonas_nike(Double double1) throws InterruptedException {

        searchPage1.filterLocation();
        searchPage1.filterBrand(filterBrand);
        searchPage1.filterPrice();
    }

    @When("I search a specific category")
    public void i_sear_a_specific_product() {
        searchPage2 = homePage.goSearch();
    }

    String nameText1,nameText2;
    @When("I filter the search by Baraka home")
    public void i_filter_the_search_by_baraka_home() throws InterruptedException {
        searchPage2.filterBrand();
        searchPage2.paginationProducts();
        nameText1 = searchPage2.getTextItem1();
    }

    @When("I select a product randomly")
    public void i_select_a_product_randomly() throws InterruptedException {
        searchPage2.selectItem();
        nameText2 = searchPage2.getTextItem2();
    }
    @Then("I should be able tu see the details about the product")
    public void i_should_be_able_tu_see_the_details_about_the_product(){
    assertEquals(nameText1, nameText2);
    tearDown();
    }

    @Then("I should be able to see a list of products")
    public void iShouldBeAbleToSeeAListOfProducts() {
        assertEquals(filterBrand,searchPage1.veryBrandText());
        tearDown();
    }
}
