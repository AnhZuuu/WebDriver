package model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PopupPage {
    private WebDriver driver;

    private By closeWindow = By.xpath("//button[@title='Close Window']");

    public PopupPage(WebDriver driver){
        this.driver = driver;
    }


    public void ClickButtonClose() {
        driver.findElement(closeWindow).click();
    }
}
