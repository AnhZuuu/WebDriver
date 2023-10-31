package test;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import driver.driverFactory;
import model.pages.CartPage;
import model.pages.CheckoutPage;
import model.pages.LoginPage;
//import model.pages.MobilePage;

public class Shopping {
    @Test
    public void Buying() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            //MobilePage mobilePage = new MobilePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            CartPage cartPage = new CartPage(driver);
            CheckoutPage checkoutPage = new CheckoutPage(driver);

            //LOGIN
            loginPage.Login("vu@gmail.com", "123456");

            //Wishlist, add to cart, come nearly to checkout
            cartPage.Add("hehe", "123");
            cartPage.Proceed();

            //CHECKOUT
            checkoutPage.checkOut();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
