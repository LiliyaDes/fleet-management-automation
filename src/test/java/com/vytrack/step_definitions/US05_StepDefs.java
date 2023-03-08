package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleModelsPage_XBH;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class US05_StepDefs {
    VehicleModelsPage_XBH vehicleModelsPage = new VehicleModelsPage_XBH();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Click the Vehicle models under the Fleet")
    public void click_the_vehicle_models_under_the_fleet() {
        for (WebElement eachModule : vehicleModelsPage.menuOptions) {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            if (eachModule.getText().contains("Fleet")) {
                Actions actions = new Actions(Driver.getDriver());
                Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                actions.moveToElement(eachModule).perform();

            }
        }

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        vehicleModelsPage.vehiclesModelOption.click();
    }

    @And("Verify sales manager can access the Vehicle models page")
    public void verify_sales_manager_can_access_the_vehicle_models_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.pageSubTitle.isDisplayed());
    }

    @And("Verify sales manager sees the column: MODEL NAME on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnMODELNAMEOnTheVehicleModelsPage()
    {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.modelName.isDisplayed());
    }


    @And("Verify sales manager sees the column: MAKE on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnMAKEOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.make.isDisplayed());
    }

    @And("Verify sales manager sees the column: CAN BE REQUESTED on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnCANBEREQUESTEDOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.canBeRequested.isDisplayed());
    }

    @And("Verify sales manager sees the column: CVVI on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnCVVIOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.cvvi.isDisplayed());
    }

    @And("Verify sales manager sees the column: COTwo Fee on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnCOTwoFeeOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.coTwoFeeMonth.isDisplayed());
    }

    @And("Verify sales manager sees the column: COST DEPRECIATED on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnCOSTDEPRECIATEDOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.costDepreciated.isDisplayed());
    }

    @And("Verify sales manager sees the column: COTwo Emissions on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnCOTwoEmissionsOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.coTwoEmissions.isDisplayed());
    }

    @And("Verify sales manager sees the column: FUEL TYPE on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnFUELTYPEOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.fuelType.isDisplayed());
    }

    @And("Verify sales manager sees the column: VENDORS on the Vehicle models page")
    public void verifySalesManagerSeesTheColumnVENDORSOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.vendors.isDisplayed());
    }

    //**********************************************************
    @Then("StMgr Click the Vehicle models under the Fleet")
    public void stMgr_click_the_vehicle_models_under_the_fleet() {
        for (WebElement eachModule : vehicleModelsPage.menuOptions) {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            if (eachModule.getText().contains("Fleet")) {
                Actions actions = new Actions(Driver.getDriver());
                Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                actions.moveToElement(eachModule).perform();

            }
        }
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(vehicleModelsPage.fleetModule).perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        vehicleModelsPage.vehiclesModelOption.click();
    }

    @And("Verify store manager can access the Vehicle models page")
    public void verify_store_manager_can_access_the_vehicle_models_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.pageSubTitle.isDisplayed());
    }

    @And("Verify store manager sees the column: MODEL NAME on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnMODELNAMEOnTheVehicleModelsPage()
    {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.modelName.isDisplayed());
    }


    @And("Verify store manager sees the column: MAKE on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnMAKEOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.make.isDisplayed());
    }

    @And("Verify store manager sees the column: CAN BE REQUESTED on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnCANBEREQUESTEDOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.canBeRequested.isDisplayed());
    }

    @And("Verify store manager sees the column: CVVI on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnCVVIOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.cvvi.isDisplayed());
    }

    @And("Verify store manager sees the column: COTwo Fee on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnCOTwoFeeOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.coTwoFeeMonth.isDisplayed());
    }

    @And("Verify store manager sees the column: COST DEPRECIATED on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnCOSTDEPRECIATEDOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.costDepreciated.isDisplayed());
    }

    @And("Verify store manager sees the column: COTwo Emissions on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnCOTwoEmissionsOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.coTwoEmissions.isDisplayed());
    }

    @And("Verify store manager sees the column: FUEL TYPE on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnFUELTYPEOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.fuelType.isDisplayed());
    }

    @And("Verify store manager sees the column: VENDORS on the Vehicle models page")
    public void verifyStoreManagerSeesTheColumnVENDORSOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.vendors.isDisplayed());
    }

    @Then("Click the Vehicle Model under the Fleet")
    public void clickTheVehicleModelUnderTheFleet() {
        for (WebElement eachModule : vehicleModelsPage.menuOptions) {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            if (eachModule.getText().contains("Fleet")) {
                Actions actions = new Actions(Driver.getDriver());
                Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                actions.moveToElement(eachModule).perform();
            }
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            vehicleModelsPage.vehiclesModelOption.click();
        }
    } //do not delete


        @And("Verify users see an error message: You do not have permission to perform this action")
        public void verifyUsersSeeAnErrorMessageYouDoNotHavePermissionToPerformThisAction () {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Assert.assertTrue(VehicleModelsPage_XBH.errorMessage.isDisplayed());
        }

    /*@And("Verify manager sees the column: COTwoFee on the Vehicle models page")
    public void verifyManagerSeesTheColumnCOTwoFeeOnTheVehicleModelsPage() {
        BrowserUtils.sleep(3);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(vehicleModelsPage.coTwoFeeMonth.isDisplayed());
    }*/
    }

