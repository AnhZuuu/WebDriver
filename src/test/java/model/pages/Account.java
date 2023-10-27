package model.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class Account {
    private WebDriver driver;
    public Account(WebDriver driver) {
        this.driver = driver;
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

    private By firstName = By.id("firstname");
    private By middleName = By.id("middlename");
    private By lastName = By.id("lastname");
    private By email = By.id("email_address");
    private By password = By.id("password");
    private By confirm = By.id("confirmation");
    private By buttonRegister = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");

    public void input(String firstname, String middlename,
                    String lastname, String Email, String pass, String confirmation){
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(middleName).sendKeys(middlename);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(email).sendKeys(Email);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirm).sendKeys(confirmation);
    }
    public void clickRegister() {
        driver.findElement(buttonRegister).click();
    }

}
