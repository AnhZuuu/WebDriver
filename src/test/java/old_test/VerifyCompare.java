package old_test;

import driver.driverFactory;
import model.pages.CartPage;
import model.pages.MobilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCompare {
    @Test
    public void TestAddProduct() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);
            //CartPage cartPage = new CartPage(driver);
            

            // Click on MOBILE menu
            driver.findElement(By.linkText("MOBILE")).click();

            //add Sony and Samsung to compare
            mobilePage.addToCompareSony();
            mobilePage.addToCompareiPhone();

            //Compare phones
            mobilePage.ClickButtonCompare();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}