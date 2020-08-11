package com.saucedemo;
import com.saucedemo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssessmentTest extends BaseTest {

    /*
   From this URL: https://www.seleniumeasy.com/test/basic-first-form-demo.html
        1. Set the value of id user-message to "QA assessment trial #1"
        2. Click 'Show Message'
        3. Assert that "Your Message" matches "QA assessment trial #1"
*/
    @Test
    public void shoudHaveCorrectMessage() {
       WebDriver driver =  getDriver();
       driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
       driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("QA assessment trial #1");
       driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        String m = driver.findElement(By.id("display")).getText();
        Assert.assertEquals(m, "QA assessment trial #1");
    }


    /*
    From this URL: https://www.seleniumeasy.com/test/basic-first-form-demo.html.
     Your next test should:
        1. Interact with the menu on the left of the page and click "Input Forms"
        2. On the sub-menu, click "Checkbox Demo"
        3. Under "Multiple Checkbox Demo" there are 2 bugs with the multiple checkbox component
        and it is up to you to figure out what it is and write a test that fails at least 1/2 conditions
        4. Hint: read the bulletpoints to help you find the bug(s)
*/
    @Test
    public void checkboxTest() {

        WebDriver driver =  getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
       WebElement checkBoxDemo = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
       wait.until(ExpectedConditions.elementToBeClickable(checkBoxDemo));
       checkBoxDemo.click();
       WebElement singleCheckBox = driver.findElement(By.id("isAgeSelected"));
       wait.until(ExpectedConditions.elementToBeClickable(singleCheckBox));
       singleCheckBox.click();
       String verMes = driver.findElement(By.id("txtAge")).getText();
       Assert.assertEquals(verMes, "Success - Check box is checked");

    }

    @Test
    public void multiCheckBoxTest() {
        WebDriver driver =  getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        WebElement checkBoxDemo = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxDemo));
        checkBoxDemo.click();
        WebElement checkAll = driver.findElement(By.id("check1"));
        wait.until(ExpectedConditions.elementToBeClickable(checkAll));
        Assert.assertEquals(checkAll.getAttribute("value"), "Uncheck All");

        driver.findElement(By.xpath("//label[text()='Option 1']/input")).click();

        Assert.assertEquals(checkAll.getAttribute("value"), "Check All");


    }

    /*
    In real life we wouldn't waste precious seconds to mouse nav, sorry to make you do that.
    The next test is working with selectors but it would be far too easy to use native selects.
    My final test for you is to work with jquery selects.
        1. From this URL: https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html
        2. Under the country select Japan & assert the field value is Japan
        3. Under the multi select select Delaware & Vermont & assert the field values
        4. Under US Outlying Territories assert that Guam & United States Minor Outlying Islands are disabled
*/
    @Test
    public void selectJapanTest(){
        WebDriver driver =  getDriver();
        driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('select2-country-container').value= 'Japan'");
        Assert.assertEquals(js.executeScript("return document.getElementById('select2-country-container').value"), "Japan");
    }
    @Test
    public void multiSelectDelewareAndVermont() {


    }
    @Test
    public void validateDisabledValuesSelect() {

    }
}
