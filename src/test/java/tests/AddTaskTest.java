package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTaskTest extends BaseTest {

    @Test
    public void testAddTask() {
        String task = "Code";
        WebElement inputBox = driver.findElement(By.name("newItem"));
        inputBox.sendKeys(task);
        WebElement addButton = driver.findElement(By.cssSelector("button[type='submit']"));
        addButton.click();

        WebElement addedTask = driver.findElement(By.xpath("//li[contains(text(),'" + task + "')]"));
        Assert.assertTrue(addedTask.isDisplayed(), "Task not added successfully");
    }
}
