package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By btnContinueBill = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[1]/button[1]/span[1]/span[1]");
    private By btnContinueShip = By.xpath(".//*[@id='shipping-method-buttons-container']/button");
    private By moneyOrder = By.xpath("//label[contains(text(),'Check / Money order')]");
    private By btnContinuePay = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[4]/div[2]/div[2]/button[1]");
    private By btnPlaceOrder = By.xpath("//span[contains(text(),'Place Order')]");
    private By codeOrder = By.xpath("1");
    private By btnContinueShopping = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]");

    public void checkOut() throws InterruptedException {
        driver.findElement(btnContinueBill).click();
        Thread.sleep(2000);
        driver.findElement(btnContinueShip).click();
        Thread.sleep(2000);
        driver.findElement(moneyOrder).click();
        Thread.sleep(2000);
        driver.findElement(btnContinuePay).click();
        Thread.sleep(2000);
        driver.findElement(btnPlaceOrder).click();
        Thread.sleep(2000);
        driver.findElement(codeOrder).getText();
        driver.findElement(btnContinueShopping).click();
    }
}
