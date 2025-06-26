package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MarkCompleteTest extends BaseTest {

    @Test
    public void testMarkTaskComplete() {
        String task = "Eat";
        WebElement inputBox = driver.findElement(By.name("newItem"));
        inputBox.sendKeys(task);
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebElement checkbox = driver.findElement(By.xpath("//li[contains(text(),'" + task + "')]/preceding-sibling::input[@type='checkbox']"));
        checkbox.click();

        Assert.assertTrue(checkbox.isSelected(), "Task was not marked complete");
    }
}
