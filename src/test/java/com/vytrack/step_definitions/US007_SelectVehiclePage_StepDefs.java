package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.SelectVehiclePage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US007_SelectVehiclePage_StepDefs {

    SelectVehiclePage selectVehiclePage = new SelectVehiclePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("store manager sees Fleet module name and clicks on it")
    public void store_manager_sees_fleet_module_name_and_clicks_on_it() {
        BrowserUtils.sleep(4);
        actions.moveToElement(selectVehiclePage.clickFleet).perform();
    }

    @Then("store manager click on Vehicles dropdown")
    public void store_manager_click_on_vehicles_dropdown() {
        BrowserUtils.sleep(4);
        actions.click(selectVehiclePage.clickOnVehicle).perform();
    }

    @Then("store manager verify all the checkboxes are unchecked")
    public void store_manager_verify_all_the_checkboxes_are_unchecked() {
        BrowserUtils.sleep(4);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]/input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is checked");
            } else {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is unchecked");
            }
        }
    }




    @When("sales manager sees Fleet module name and clicks on it")
    public void sales_manager_sees_fleet_module_name_and_clicks_on_it() {
        BrowserUtils.sleep(4);
        actions.moveToElement(selectVehiclePage.clickFleet).perform();

    }
    @Then("sales manager click on Vehicles dropdown")
    public void sales_manager_click_on_vehicles_dropdown() {
        BrowserUtils.sleep(4);
        actions.click(selectVehiclePage.clickOnVehicle).perform();

    }
    @Then("sales manager verify all the checkboxes are unchecked")
    public void sales_manager_verify_all_the_checkboxes_are_unchecked() {
        BrowserUtils.sleep(4);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]/input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is checked");
            } else {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is unchecked");
            }
        }
    }



    @Then("store manager click the 1st checkbox in the web-table")
    public void store_manager_click_the_1st_checkbox_in_the_web_table() {
      selectVehiclePage.firstCheckbox.click();
    }
    @Then("store manager Verify all the checkboxes also checked")
    public void store_manager_verify_all_the_checkboxes_also_checked() {
        BrowserUtils.sleep(4);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]/input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is checked");
            } else {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is unchecked");
            }
        }
    }



    @Then("sales manager click the 1st checkbox in the web-table")
    public void sales_manager_click_the_1st_checkbox_in_the_web_table() {
        selectVehiclePage.firstCheckbox.click();
    }
    @Then("sales manager Verify all the checkboxes also checked")
    public void sales_manager_verify_all_the_checkboxes_also_checked() {
        BrowserUtils.sleep(4);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]/input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is checked");
            } else {
                System.out.println("Checkbox " + checkbox.getAttribute("id") + " is unchecked");
            }
        }
    }




    @Then("store manager check any car’s checkbox")
    public void store_manager_check_any_car_s_checkbox() {
        selectVehiclePage.anyBoxChecked.click();
    }
    @Then("store manager verify the box is checked")
    public void store_manager_verify_the_box_is_checked() {
        BrowserUtils.sleep(4);
        if (selectVehiclePage.anyBoxChecked.isSelected()) {
            System.out.println("Checkbox " + selectVehiclePage.anyBoxChecked.getAttribute("id") + " is checked");
        } else {
            System.out.println("Checkbox " + selectVehiclePage.anyBoxChecked.getAttribute("id") + " is unchecked");
        }
    }



    @Then("sales manager check any car’s checkbox")
    public void sales_manager_check_any_car_s_checkbox() {
        selectVehiclePage.anyBoxChecked.click();

    }
    @Then("sales manager verify the box is checked")
    public void sales_manager_verify_the_box_is_checked() {
        BrowserUtils.sleep(4);
        if (selectVehiclePage.anyBoxChecked.isSelected()) {
            System.out.println("Checkbox " + selectVehiclePage.anyBoxChecked.getAttribute("id") + " is checked");
        } else {
            System.out.println("Checkbox " + selectVehiclePage.anyBoxChecked.getAttribute("id") + " is unchecked");
        }
    }

    }


















