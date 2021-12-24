package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage2 {

    private WebDriver driver;
    private By categoryBrand = By.id("testId-Accordion-Marca");
    private By brandField = By.id("testId-Multiselect-Marca");
    private By brandText = By.xpath("//*[@id='testId--desktop-container']/div/ul/li[2]/div/ul/li[1]/label");
    private By nextPagination = By.xpath("//*[@id='testId-pagination-top-arrow-right']/i");
    private By pagination = By.id("testId-pagination-top-button2");
    private By firstOption = By.id("testId-pod-18600874");
    private By nameItemBefore = By.id("testId-pod-displaySubTitle-18600873");
    private By nameItemAfter = By.xpath("//*[@id='__next']/div/section/div[1]/div[1]/div[2]/section[2]/div[1]/div[2]/h1/div");

    public SearchPage2(WebDriver driver) {
        this.driver = driver;
    }

    public void filterBrand() throws InterruptedException {
        driver.findElement(categoryBrand).click();
        driver.findElement(brandField).sendKeys("BARAKA HOME");
        driver.findElement(brandText).click();
        Thread.sleep(2000);
        driver.findElement(categoryBrand).click();
    }

    public void paginationProducts(){
        driver.findElement(pagination).click();
    }

    public void selectItem() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(nameItemBefore).click();
        Thread.sleep(2000);
    }

    public String getTextItem1(){
        return driver.findElement(nameItemBefore).getText();
    }

    public String getTextItem2(){
        return driver.findElement(nameItemAfter).getText();
    }


}
