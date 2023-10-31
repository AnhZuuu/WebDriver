package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
    private WebDriver driver;
    private By cartMessage = By.xpath("//h1[normalize-space()='Shopping Cart is Empty']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartMessage() {
        return driver.findElement(cartMessage).getText();
    }

    //Test case 6
    // private By btnMyWish = By.xpath("//strong[contains(text(),'My Wishlist')]");
    private By btnAddToCart = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]/span[1]/span[1]");
    private By chooseCountry = By.xpath("//select[@id='country']//option[10]");
    private By chooseRegion = By.id("region");
    private By zip = By.id("postcode");
    private By btnEstimate = By.xpath("//span[contains(text(),'Estimate')]");
    private By btnFlatRate = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/dl[1]/dd[1]/ul[1]/li[1]/label[1]");
    private By btnUpdateTotal = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[1]/button[1]");
    private By btnProceed = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[1]");
    
    public void Add(String region, String postcode){
        driver.findElement(By.linkText("MY WISHLIST")).click();
        driver.findElement(btnAddToCart).click();
        driver.findElement(chooseCountry).click();
        driver.findElement(chooseRegion).sendKeys(region);
        driver.findElement(zip).sendKeys(postcode);
        driver.findElement(btnEstimate).click();
        driver.findElement(btnFlatRate).click();
        driver.findElement(btnUpdateTotal).click();
    }

    public void Proceed(){
        driver.findElement(btnProceed).click();

    }
    
}
