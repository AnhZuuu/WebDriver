package test;

import driver.driverFactory;
import model.pages.CartPage;
import model.pages.MobilePage;
import model.pages.PopupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortBy {
    @Test
    public void testSortBy() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);
            
            // Click on MOBILE menu
            driver.findElement(By.linkText("MOBILE")).click();

            //Sort
            mobilePage.sortNameSelected();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
