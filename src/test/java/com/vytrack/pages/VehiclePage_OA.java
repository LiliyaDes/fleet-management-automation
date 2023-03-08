package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage_OA extends BasePage {
    public VehiclePage_OA(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(xpath = "(//span[@class='title title-level-1'])[normalize-space()='Fleet']")
   // @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a")
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]")
    public WebElement fleet;



    //@FindBy(xpath = "//span[.='Vehicles']")
    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    public WebElement vehiclesBTM;



    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement tables;

    @FindBy(xpath = "(//table//a[@data-toggle='dropdown'])[1]")
    public WebElement threeDots;

//    @FindBy(xpath= "//div[@class='dropdown']")
//    public WebElement getThreeDots;
}
