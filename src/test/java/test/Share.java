package test;

import driver.driverFactory;
import model.pages.Account;
import model.pages.CartPage;
import model.pages.MobilePage;
import model.pages.PopupPage;
import model.pages.TV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Share {
    @Test
    public void ShareWishList() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);
            Account account = new Account(driver);
            TV tv = new TV(driver);
            //create a new account
            mobilePage.clickMyAccount();
            mobilePage.clickCreateAccount();
            //input the account information
            account.input("Vu", "Anh", "Dang", "kjfhskjf@gmail.com", "123456", "123456");
            account.clickRegister();
            //add TV and share
            tv.clickButtonTV();
            tv.clickAddToWishListLG();
            tv.clickShareWishListLG();
            tv.fill("tienn@gmail.com", "I want ittttt");
            tv.clickShare();
            //compare notfication
            String expected = "Your Wishlist has been shared.";
            Assert.assertEquals(expected, tv.getNotification());
        }catch (Exception e) {e.printStackTrace();}
        driver.quit();
    }
}
