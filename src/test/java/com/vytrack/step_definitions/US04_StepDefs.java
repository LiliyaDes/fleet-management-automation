package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleContractsPage_Liliya;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
;import java.time.Duration;

public class US04_StepDefs {

    VehicleContractsPage_Liliya vehicleContractsPage = new VehicleContractsPage_Liliya();

    @When("Click the Vehicle contracts under the Fleet")
    public void click_the_vehicle_contracts_under_the_fleet() {
        for (WebElement eachModule : vehicleContractsPage.menuOptions) {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            if (eachModule.getText().contains("Fleet")) {
                Actions actions = new Actions(Driver.getDriver());
                Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                actions.moveToElement(eachModule).perform();

            }
        }
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(vehicleContractsPage.fleetModule).perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        vehicleContractsPage.contractsOption.click();
    }

    @Then("Verify manager can access the Vehicle contracts page")
    public void verify_manager_can_access_the_vehicle_contracts_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleContractsPage.pageSubTitle.isDisplayed());
    }

    @Then("Verify users see an error message: “You do not have permission to perform this action.”")
    public void verify_users_see_an_error_message_you_do_not_have_permission_to_perform_this_action() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleContractsPage.message2.isDisplayed());
    }

}
