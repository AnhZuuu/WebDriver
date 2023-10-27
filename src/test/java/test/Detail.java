package test;

import driver.driverFactory;
import model.pages.CartPage;
import model.pages.MobilePage;
import model.pages.PopupPage;
import model.pages.SonyDetailPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Detail {
    @Test
    public void testSonyDetail() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);            
            SonyDetailPage sdp = new SonyDetailPage(driver);

            // Click on MOBILE menu
            driver.findElement(By.linkText("MOBILE")).click();

            //Click on Sony
            mobilePage.clickOnSony();
            Assert.assertEquals(mobilePage.getCostOfSony(), sdp.getValueSony());

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
