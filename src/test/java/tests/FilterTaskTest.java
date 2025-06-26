package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTaskTest extends BaseTest {

    @Test
    public void testFilterTasks() {
        driver.findElement(By.linkText("Completed")).click();
        WebElement completedList = driver.findElement(By.id("task-list"));
        Assert.assertTrue(completedList.isDisplayed(), "Completed tasks not visible");
    }
}
