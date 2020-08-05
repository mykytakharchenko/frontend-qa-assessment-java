package com.saucedemo;
import com.saucedemo.BaseTest;
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
    public void checkboxTest() {

    }

    public void multiCheckBoxTest() {

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
    public void selectJapanTest(){

    }

    public void multiSelectDelewareAndVermont() {

    }

    public void validateDisabledValuesSelect() {

    }
}
