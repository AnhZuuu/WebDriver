package model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MobilePage {
    private WebDriver driver;
    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }
    // Test case 1
    //private By sortName = By
    //        .xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]");
    private By sortName = By.xpath("//select//option[2]");
    private By dropDownBy = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
    public void sortNameSelected(){
        //driver.findElement(sortName).isSelected();
        driver.findElement(sortName).click();
        driver.findElement(dropDownBy).click();
    }
    
    
    
    //Test case 2
    private By costOfSony = By.id("product-price-1");
    private By detailSony = By.xpath("//li[2]//div[1]//h2");
    //Compare cost of Sony
    public String getCostOfSony() {
        return driver.findElement(costOfSony).getText();
    }
    public void clickOnSony() {
        driver.findElement(detailSony).click();
    }
    
    
    
    // Test case 3
    private By addToCartSonyXperiaButton = By.xpath("//li[2]//div[1]//div[3]//button[1]");
    private By qtyField = By.xpath("//input[@title='Qty']");
    private By updateButton = By.xpath("//button[@title='Update']//span//span[contains(text(),'Update')]");
    private By errorMessage = By.className("error-msg");
    private By emptyCartLink = By.xpath("//button[@title='Empty Cart']");

    public void addToCartSonyXperia() {
        driver.findElement(addToCartSonyXperiaButton).click();
    }

    public void updateQuantity(String quantity) {
        driver.findElement(qtyField).clear();
        driver.findElement(qtyField).sendKeys(quantity);
        driver.findElement(updateButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void clickEmptyCart() {
        driver.findElement(emptyCartLink).click();
    }

    
    
    
    // Test case 4
    private By addToCompareSamsung = By.xpath("//li[1]//div[1]//div[3]//li[2]//a");
    private By addToCompareSony = By.xpath("//li[2]//div[1]//div[3]//li[2]//a");
    private By addToCompareiPhone = By.xpath("//li[3]//div[1]//div[3]//li[2]//a");
    private By buttonCompare = By.xpath("//button[@title='Compare']");

    public void addToCompareSamSung() {
        driver.findElement(addToCompareSamsung).click();
    }
    public void addToCompareSony() {
        driver.findElement(addToCompareSony).click();
    }
    public void addToCompareiPhone() {
        driver.findElement(addToCompareiPhone).click();
    }
    public void ClickButtonCompare() {
        driver.findElement(buttonCompare).click();
    }




    //Test case 5
    private By myAccount = By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]");
    private By createAccount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/a[1]");

    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }
    public void clickCreateAccount() {
        driver.findElement(createAccount).click();
    }
}