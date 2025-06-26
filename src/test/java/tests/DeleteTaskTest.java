package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteTaskTest extends BaseTest {

    @Test
    public void testDeleteTask() {
        String task = "Sleep";
        WebElement inputBox = driver.findElement(By.name("newItem"));
        inputBox.sendKeys(task);
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebElement deleteButton = driver.findElement(By.xpath("//li[contains(text(),'" + task + "')]/following-sibling::button"));
        deleteButton.click();

        boolean isTaskPresent = driver.findElements(By.xpath("//li[contains(text(),'" + task + "')]")).size() > 0;
        Assert.assertFalse(isTaskPresent, "Task was not deleted");
    }
}
