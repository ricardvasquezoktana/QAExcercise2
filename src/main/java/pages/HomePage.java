package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public RegisterPage clickRegisterPage(){
       clickXPath("//li[@id='testId-UserAction-userinfo']/div/div[2]");
       clickLinkText("Regístrate");
        return new RegisterPage(driver);
    }

    public SearchPage1 goCategory(){
        clickXPath("//*[@id='testId-HamburgerBtn-toggle']/div[1]");
        clickXPath("//*[@id='cross-header']/div[3]/div/div[2]/div/ul/li[9]/div/p");
        clickXPath("//*[@id='testId-ThirdLevelMenu-link']/b");
        return new SearchPage1(driver);
    }

    public SearchPage2 goSearch(){
        driver.findElement(By.id("testId-SearchBar-Input")).sendKeys("Muebles");
        clickXPath("//*[@id='testId-search-wrapper']/div/button");
        return new SearchPage2(driver);
    }

    private void clickLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    private void clickXPath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
