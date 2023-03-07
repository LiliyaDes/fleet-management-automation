package com.vytrack.step_definitions;

import com.vytrack.pages.MainModulesPage_AA;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US01_StepDefs {

    MainModulesPage_AA modulesPage = new MainModulesPage_AA();
    Actions actions = new Actions(Driver.getDriver());

    @Then("store manager sees Dashboards module name")
    public void storeManagerSeesDashboardsModuleName() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(modulesPage.dashboards.isDisplayed());
    }

    @And("store manager sees Fleet module name")
    public void storeManagerSeesFleetModuleName() {
        actions.moveToElement(modulesPage.fleet).perform();
        Assert.assertTrue(modulesPage.fleet.isDisplayed());
    }

    @And("store manager sees Customers module name")
    public void storeManagerSeesCustomersModuleName() {
        actions.moveToElement(modulesPage.customers).perform();
        Assert.assertTrue(modulesPage.customers.isDisplayed());
    }

    @And("store manager sees Sales module name")
    public void storeManagerSeesSalesModuleName() {
        actions.moveToElement(modulesPage.sales).perform();
        Assert.assertTrue(modulesPage.sales.isDisplayed());
    }

    @And("store manager sees Activities module name")
    public void storeManagerSeesActivitiesModuleName() {
        actions.moveToElement(modulesPage.activities).perform();
        Assert.assertTrue(modulesPage.activities.isDisplayed());
    }

    @And("store manager sees Marketing module name")
    public void storeManagerSeesMarketingModuleName() {
        actions.moveToElement(modulesPage.marketing).perform();
        Assert.assertTrue(modulesPage.marketing.isDisplayed());
    }

    @And("store manager sees Reports & Segments module name")
    public void storeManagerSeesReportsSegmentsModuleName() {
        actions.moveToElement(modulesPage.reportsSegments).perform();
        Assert.assertTrue(modulesPage.reportsSegments.isDisplayed());
    }

    @And("store manager sees System module name")
    public void storeManagerSeesSystemModuleName() {
        actions.moveToElement(modulesPage.system).perform();
        Assert.assertTrue(modulesPage.system.isDisplayed());
    }









    @Then("sales manager sees Dashboards module name")
    public void sales_manager_sees_dashboards_module_name() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(modulesPage.dashboards.isDisplayed());
    }
    @Then("sales manager sees Fleet module name")
    public void sales_manager_sees_fleet_module_name() {
        actions.moveToElement(modulesPage.fleet).perform();
        Assert.assertTrue(modulesPage.fleet.isDisplayed());
    }
    @Then("sales manager sees Customers module name")
    public void sales_manager_sees_customers_module_name() {
        actions.moveToElement(modulesPage.customers).perform();
        Assert.assertTrue(modulesPage.customers.isDisplayed());
    }
    @Then("sales manager sees Sales module name")
    public void sales_manager_sees_sales_module_name() {
        actions.moveToElement(modulesPage.sales).perform();
        Assert.assertTrue(modulesPage.sales.isDisplayed());
    }
    @Then("sales manager sees Activities module name")
    public void sales_manager_sees_activities_module_name() {
        actions.moveToElement(modulesPage.activities).perform();
        Assert.assertTrue(modulesPage.activities.isDisplayed());
    }
    @Then("sales manager sees Marketing module name")
    public void sales_manager_sees_marketing_module_name() {
        actions.moveToElement(modulesPage.marketing).perform();
        Assert.assertTrue(modulesPage.marketing.isDisplayed());
    }
    @Then("sales manager sees Reports & Segments module name")
    public void sales_manager_sees_reports_segments_module_name() {
        actions.moveToElement(modulesPage.reportsSegments).perform();
        Assert.assertTrue(modulesPage.reportsSegments.isDisplayed());
    }
    @Then("sales manager sees System module name")
    public void sales_manager_sees_system_module_name() {
        actions.moveToElement(modulesPage.system).perform();
        Assert.assertTrue(modulesPage.system.isDisplayed());

    }




    @And("driver sees Fleet module name")
    public void driverSeesFleetModuleName() {
        BrowserUtils.sleep(2);
        actions.moveToElement(modulesPage.fleet).perform();
        Assert.assertTrue(modulesPage.fleet.isDisplayed());
    }

    @And("driver sees Customers module name")
    public void driverSeesCustomersModuleName() {
        actions.moveToElement(modulesPage.customers).perform();
        Assert.assertTrue(modulesPage.customers.isDisplayed());
    }

    @And("driver sees Activities module name")
    public void driverSeesActivitiesModuleName() {
        actions.moveToElement(modulesPage.activities).perform();
        Assert.assertTrue(modulesPage.activities.isDisplayed());
    }

    @And("driver sees System module name")
    public void driverSeesSystemModuleName() {
        actions.moveToElement(modulesPage.system).perform();
        Assert.assertTrue(modulesPage.system.isDisplayed());
    }
}