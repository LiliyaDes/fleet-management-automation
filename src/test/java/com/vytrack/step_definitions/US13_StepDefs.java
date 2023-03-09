package com.vytrack.step_definitions;

import com.vytrack.pages.MainModulesPage_AA;
import com.vytrack.pages.VehicleCostPage_AA;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US13_StepDefs {
    VehicleCostPage_AA vehicleCostPage = new VehicleCostPage_AA();
    Actions actions = new Actions(Driver.getDriver());

    @When("store manager sees Fleet module name and clicks on it")
    public void store_manager_sees_fleet_module_name_and_clicks_on_it() {
        BrowserUtils.sleep(4);
        actions.moveToElement(vehicleCostPage.fleet).perform();
    }

    @Then("store manager clicks on Vehicle Costs dropdown")
    public void store_manager_clicks_on_vehicle_costs_dropdown() {
        BrowserUtils.sleep(2);
        actions.click(vehicleCostPage.costsOption).perform();
    }

    @Then("store manager sees TYPE column name")
    public void store_manager_sees_type_column_name() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.typeColumnName.isDisplayed());
    }

    @Then("store manager sees TOTAL PRICE column name")
    public void store_manager_sees_total_price_column_name() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.totalPriceColumnName.isDisplayed());
    }

    @Then("store manager sees DATE column name")
    public void store_manager_sees_date_column_name() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.dateColumnName.isDisplayed());
    }

    @When("sales manager sees Fleet module name and clicks on it")
    public void salesManagerSeesFleetModuleNameAndClicksOnIt() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleCostPage.fleet).perform();
    }

    @Then("sales manager clicks on Vehicle Costs dropdown")
    public void salesManagerClicksOnVehicleCostsDropdown() {
        BrowserUtils.sleep(2);
        actions.click(vehicleCostPage.costsOption).perform();
    }

    @And("sales manager sees TYPE column name")
    public void salesManagerSeesTYPEColumnName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.typeColumnName.isDisplayed());
    }

    @And("sales manager sees TOTAL PRICE column name")
    public void salesManagerSeesTOTALPRICEColumnName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.totalPriceColumnName.isDisplayed());
    }

    @And("sales manager sees DATE column name")
    public void salesManagerSeesDATEColumnName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.dateColumnName.isDisplayed());
    }

    @When("driver sees Fleet module name and clicks on it")
    public void driverSeesFleetModuleNameAndClicksOnIt() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleCostPage.fleet).perform();
    }

    @Then("driver clicks on Vehicle Costs dropdown")
    public void driverClicksOnVehicleCostsDropdown() {
        BrowserUtils.sleep(2);
        actions.click(vehicleCostPage.costsOption).perform();
    }

    @And("driver sees TYPE column name")
    public void driverSeesTYPEColumnName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.typeColumnName.isDisplayed());
    }

    @And("driver sees TOTAL PRICE column name")
    public void driverSeesTOTALPRICEColumnName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.totalPriceColumnName.isDisplayed());
    }

    @And("driver sees DATE column name")
    public void driverSeesDATEColumnName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehicleCostPage.dateColumnName.isDisplayed());
    }

    ///////////////////////////////////////////////////////////////////////////////////


    @And("store manager locates and clicks the first checkbox")
    public void storeManagerLocatesAndClicksTheFirstCheckbox() {
        BrowserUtils.sleep(2);
        vehicleCostPage.checkbox.click();

    }


    //   @FindBy(xpath = "//tbody[@class='grid-body']")
    // public List<WebElement> checkboxes;

    @Then("all the vehicle costs are checked")
    public void allTheVehicleCostsAreChecked() {
        BrowserUtils.sleep(2);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//div[contains(@class,'grid-container')]/table/tbody/tr[1]/td[1]"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                Assert.assertTrue(checkbox.isSelected());
            }
        }
    }

    @And("sales manager locates and clicks the first checkbox")
    public void salesManagerLocatesAndClicksTheFirstCheckbox() {
        BrowserUtils.sleep(2);
        vehicleCostPage.checkbox.click();

        BrowserUtils.sleep(2);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//div[contains(@class,'grid-container')]/table/tbody/tr[1]/td[1]"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                Assert.assertTrue(checkbox.isSelected());
            }
        }


    }

    /*
    As a driver it is possible to view the Vehicle Costs page, but a checkbox option is not available for the driver.
    I omitted this test from the US but keeping it in comments just in case

    @And("driver locates and clicks the first checkbox")
    public void driverCANNOTLocateAndClickTheFirstCheckbox() {
        BrowserUtils.sleep(2);
        vehicleCostPage.checkbox.click();
    }
*/

}
