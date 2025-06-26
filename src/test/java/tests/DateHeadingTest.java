package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateHeadingTest extends BaseTest {

    @Test
    public void testDateHeadingPresence() {
        WebElement dateHeading = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(dateHeading.isDisplayed(), "Date heading not displayed");
    }
}
