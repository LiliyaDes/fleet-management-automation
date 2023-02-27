package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.OronicPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class OroincStepDefinitions {

   OronicPage oronicPage = new OronicPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is already in the log in page")
    public void user_is_already_in_the_log_in_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
       loginPage.userName.sendKeys(username);
       loginPage.password.sendKeys(password);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.submit.click();
    }

    @When("Click the question icon on the right top of the homepage")
    public void click_the_question_icon_on_the_right_top_of_the_homepage() {
      //  WebElement questionIcon = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
      //  questionIcon.click();
        oronicPage.questionIcon.click();

    }


    @Then("Verify the user's access to the Oronic Documentation page")
    public void verify_the_user_s_access_to_the_oronic_documentation_page() {
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getCurrentUrl().equals("https://doc.oroinc.com/")) {
                System.out.println("Oronic Documentation page is on");
                break;
            }
        }

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://doc.oroinc.com/");

    }






}
