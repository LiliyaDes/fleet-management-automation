package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage_Liliya extends BasePage{

    public VehicleContractsPage_Liliya(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
public WebElement fleetModule;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicle Contracts']")
    public WebElement contractsOption;

    @FindBy(xpath = "(//div[@class='message'])[1]")
    public WebElement message1;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement message2;

}
