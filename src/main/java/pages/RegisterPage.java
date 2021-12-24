package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;
    private By user = By.id("user");
    private By lastFather = By.id("apellidopaterno");
    private By lastMother = By.id("apellidomaterno");
    private By mail = By.id("mail");
    private By clave1 = By.id("clave1");
    private By clave2 = By.id("clave2");
    private By status = By.id("status");
    private By cedula = By.id("cedula");
    private By buttonSave = By.id("boton_Ar");
    private By numDni = By.id("numero_peru");
    private By gender = By.xpath("//form[@id='form51']/div[9]/div/div/label[1]/p");
    private By day = By.id("day");
    private By month = By.id("month");
    private By year = By.id("year");
    private By numTelf = By.id("celular");
    private By privCheck1 = By.xpath("//div[@id='cust_termsAndReciveMail_cmr']/div/label[1]/p");
    private By privCheck2 = By.xpath("//*[@id='cust_termsAndReciveMail_cmr']/div/label[2]/p");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeFields1(){
        driver.findElement(user).sendKeys("User Prueba");
        driver.findElement(lastFather).sendKeys("Prueba Peterno");
        driver.findElement(lastMother).sendKeys("Prueba Materno");
        driver.findElement(mail).sendKeys("mater@xmail.com");
        driver.findElement(clave1).sendKeys("Prueba23");
        driver.findElement(clave2).sendKeys("Prueba23");
    }

    public void completeFields2(){
        Select sel1 = new Select(driver.findElement(status));
        sel1.selectByVisibleText("Perú");
        Select sel2 = new Select(driver.findElement(cedula));
        sel2.selectByVisibleText("DNI");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(buttonSave)).perform();
    }

    public void completeFields3(){
        driver.findElement(numDni).sendKeys("45776788");
        driver.findElement(gender).click();
        Select sel3 = new Select(driver.findElement(day));
        Select sel4 = new Select(driver.findElement(month));
        Select sel5 = new Select(driver.findElement(year));
        sel3.selectByVisibleText("10");
        sel4.selectByVisibleText("Jun");
        sel5.selectByVisibleText("2000");
        driver.findElement(numTelf).sendKeys("987342344");
        driver.findElement(privCheck1).click();
        driver.findElement(privCheck2).click();
    }
}
