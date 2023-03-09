package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclePage_OA;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US06_StepDefs {


    VehiclePage_OA vehiclePageOa = new VehiclePage_OA();
    Actions actions = new Actions(Driver.getDriver());
    @When("Users are on the homepage and hover over to Fleet")
    public void users_are_on_the_homepage_and() {
        BrowserUtils.waitFor(2);
        actions.moveToElement(vehiclePageOa.fleet).perform();

        Assert.assertTrue(vehiclePageOa.fleet.isDisplayed());
    }
    @Then("Click the Vehicles under the Fleet")
    public void click_the_vehicles_under_the_fleet() {
        BrowserUtils.sleep(3);
       vehiclePageOa.vehiclesBTM.click();

    }
    @Then("Verify any car info has tree dots “...”, and there are  “view, edit, delete” icons")
    public void verify_any_car_info_has_dots_and_there_are_view_edit_delete_icons() {
        BrowserUtils.sleep(3);
       WebElement threeDots = Driver.getDriver().findElement(By.xpath("//div[@class='dropdown']"));
        //vehiclePageOa.threeDots.click();
        actions.moveToElement(threeDots).perform();
        List<WebElement>options=Driver.getDriver().findElements(By.xpath("//li[@class='launcher-item']/a"));
        for (WebElement each : options) {
            Assert.assertTrue(each.isDisplayed());
        }
    }


}
