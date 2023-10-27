package model.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class TV {
    private WebDriver driver;
    public TV(WebDriver driver) {
        this.driver = driver;
    }

    private By buttonTV = By.xpath("//a[contains(text(),'TV')]");
    private By addToWishListLG = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]");
    private By shareWishList = By.xpath("//span[contains(text(),'Share Wishlist')]");
    private By email = By.id("email_address");
    private By message = By.id("message");
    private By share = By.xpath("//span[contains(text(),'Share Wishlist')]");
    private By noti = By.xpath("//span[contains(text(),'Your Wishlist has been shared.')]");

    public void clickButtonTV() {
        driver.findElement(buttonTV).click();
    }
    public void clickAddToWishListLG() {
        driver.findElement(addToWishListLG).click();
    }
    public void clickShareWishListLG() {
        driver.findElement(shareWishList).click();
    }
    public void fill(String Email, String mess) {
        driver.findElement(email).sendKeys(Email);
        driver.findElement(message).sendKeys(mess);
    }
    public void clickShare() {
        driver.findElement(share).click();
    }
    public String getNotification(){
        return driver.findElement(noti).getText();
    }
}
