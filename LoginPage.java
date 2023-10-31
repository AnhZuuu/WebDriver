package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By myAccount = By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]");
    private By emailAdd = By.id("email");
    private By password = By.id("pass");
    private By btnLogin = By.id("send2");

    public void Login(String emailAddress, String pass) {
        driver.findElement(myAccount).click();
        driver.findElement(emailAdd).sendKeys(emailAddress);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }
}
