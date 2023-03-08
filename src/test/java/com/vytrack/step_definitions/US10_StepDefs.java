package com.vytrack.step_definitions;

import com.vytrack.pages.HomePage_Liliya;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class US10_StepDefs {

    HomePage_Liliya vehicleContractsPage = new HomePage_Liliya();

    @When("Click the “Calendar Events” under the Activities")
    public void click_the_calendar_events_under_the_activities() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        for (WebElement eachModule : vehicleContractsPage.menuOptions) {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            if (eachModule.getText().contains("Activities")) {
                Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                Actions actions = new Actions(Driver.getDriver());
                actions.moveToElement(eachModule);
            }
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       vehicleContractsPage.calendarEvents.click();

    }

    @When("Click the “Create Calendar Event” button")
    public void click_the_create_calendar_event_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        vehicleContractsPage.createCalendarEventsButton.click();
    }

    String msg = "Hey there";

    @When("Write a message in the Description field")
    public void write_a_message_in_the_description_field() {
        Driver.getDriver().switchTo().frame(vehicleContractsPage.descriptionBox);
        vehicleContractsPage.descriptionBox.sendKeys(msg);

    }

    @Then("Verify the message is written in the input box")
    public void verify_the_message_is_written_in_the_input_box() {

        Assert.assertTrue(Driver.getDriver().findElements(By.tagName("p")).contains(msg));
    }

}
