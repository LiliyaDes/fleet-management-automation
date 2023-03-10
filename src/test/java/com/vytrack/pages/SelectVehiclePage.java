package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectVehiclePage {


    public SelectVehiclePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Fleet')]")
    public WebElement clickFleet;

    @FindBy(xpath = "//span[contains(text(), 'Vehicles')]")
    public WebElement clickOnVehicle;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement firstCheckbox;


    @FindBy(xpath = "//tbody/tr[2]/td[1]/input[@type='checkbox']")
    public WebElement anyBoxChecked;





}
