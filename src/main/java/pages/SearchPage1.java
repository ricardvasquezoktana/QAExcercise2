package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage1 {

    private WebDriver driver;
    private By locationIcon = By.xpath("//*[@id='__next']/div/div[2]/div[2]/section[1]/div[2]/div");
    private By region = By.id("testId-Dropdown-desktop-button");
    private By regions = By.xpath("//*[@id='__next']/div/div[2]/div[2]/section[1]/div[2]/div/div[2]/div/div/div[1]/div/ul/li");
    private By saveRegion = By.id("testId-LocationDesktopContent-save");
    private By categoryBrand = By.id("testId-Accordion-Marca");
    private By searchBrand = By.id("testId-Multiselect-Marca");
    private By brandText = By.xpath("//*[@id='testId--desktop-container']/div/ul/li[2]/div/ul/li[1]/label");
    private By categoryPrice = By.id("testId-Accordion-Precio");
    private By minPriceField = By.id("testId-range-from");
    private By maxPriceField = By.id("testId-range-to");
    private By saveParamPrice = By.xpath("//*[@id='testId--desktop-container']/div/ul/li[3]/div/div/div/div[3]/div/button");
    private By nameItemBefore = By.id("testId-pod-displaySubTitle-18266229");
    private By veryBrand = By.xpath("//*[@id='testId-pod-18441410']/div[2]/a/div/b");
    public SearchPage1(WebDriver driver) {
        this.driver = driver;
    }

    public void filterLocation() throws InterruptedException {
        String regionName;
        driver.findElement(locationIcon).click();
        Thread.sleep(2000);
        driver.findElement(region).click();
        List<WebElement> regiones = driver.findElements(regions);
        for (WebElement regione : regiones) {
            regionName = regione.getText();
            if (regionName.equals("AMAZONAS")) {
                regione.click();
                break;
            }
        }
        driver.findElement(saveRegion).click();
    }
    public void filterBrand(String filterBrand) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(categoryBrand).click();
        driver.findElement(searchBrand).sendKeys(filterBrand);
        driver.findElement(brandText).click();
        Thread.sleep(2000);
        driver.findElement(categoryBrand).click();
    }

    public void filterPrice() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(categoryPrice).click();
        driver.findElement(minPriceField).sendKeys("50");
        driver.findElement(maxPriceField).sendKeys("200");
        driver.findElement(saveParamPrice).click();
        Thread.sleep(2000);
        driver.findElement(categoryPrice).click();
    }

    public void selectItem() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(nameItemBefore).click();
    }

    public String veryBrandText(){
        return driver.findElement(veryBrand).getText();
    }

}
