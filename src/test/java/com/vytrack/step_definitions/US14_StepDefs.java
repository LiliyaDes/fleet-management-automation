package com.vytrack.step_definitions;

import com.vytrack.pages.HomePage_Liliya;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class US14_StepDefs {

    HomePage_Liliya homePage = new HomePage_Liliya();
    Actions actions = new Actions(Driver.getDriver());
    @When("Click the Campaigns under the Marketing")
    public void click_the_campaigns_under_the_marketing() {

                BrowserUtils.sleep(10);
                actions.moveToElement(homePage.marketingModule).perform();

       BrowserUtils.sleep(5);
        homePage.campaignsOption.click();
    }

    @When("Click the Manage filters button")
    public void click_the_manage_filters_button() {
       homePage.filters.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage.manageFilters.click();

    }
    Select select = new Select(homePage.dropdown);

    @Then("Verify {int} options are checked by default")
    public void verify_options_are_checked_by_default(Integer numberOfOptions) {

        Assert.assertTrue(select.getAllSelectedOptions().size() == numberOfOptions);
    }

    @When("Uncheck one or more filter options")
    public void uncheck_one_or_more_filter_options() {
        select.deselectByVisibleText("Name");
        select.deselectByVisibleText("Budget");
    }

    @Then("Verify one or more options are unchecked")
    public void verify_one_or_more_options_are_unchecked() {

        Assert.assertTrue(select.getAllSelectedOptions().size()==3);

    }
}
