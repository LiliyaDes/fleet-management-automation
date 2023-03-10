package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleModelsPage_XBH extends BasePage
{

    public VehicleModelsPage_XBH() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetModule;
    //uncomment out in case tc failure

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicles Model']")
    public WebElement vehiclesModelOption;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='Model Name'])")
    public WebElement modelName;


    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='Make'])")
    public WebElement make;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='Can be requested'])")
    public WebElement canBeRequested;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='CVVI'])")
    public WebElement cvvi;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='CO2 Fee (/month)'])")
    public WebElement coTwoFeeMonth;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='Cost (Depreciated)'])")
    public WebElement costDepreciated;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='CO2 Emissions'])")
    public WebElement coTwoEmissions;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='Fuel Type'])")
    public WebElement fuelType;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'][normalize-space()='Vendors'])")
    public WebElement vendors;

   // @FindBy(xpath = "(//div[@class='message'])[2]")
    // public static WebElement message;
    //first locator for error message

    @FindBy(xpath = "(//div[@class='message'])[2]")
        public static WebElement errorMessage;
    //second xpath locator for error message

    //@FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-711639553\"]/div[2]/div[2]/div[2]/div/table/thead[2]/tr/th[2]/a/span[1]")
    //public WebElement make;
}
