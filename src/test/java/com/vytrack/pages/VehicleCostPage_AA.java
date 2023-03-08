package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostPage_AA extends BasePage{
 public VehicleCostPage_AA(){
     PageFactory.initElements(Driver.getDriver(), this);
 }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleet;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicle Costs']")
    public WebElement costsOption;

    @FindBy(xpath = "//span[@class='grid-header-cell__label'][normalize-space()='Type']")
    public WebElement typeColumnName;

    @FindBy(xpath = "//span[@class='grid-header-cell__label'][normalize-space()='Total Price']")
    public WebElement totalPriceColumnName;

    @FindBy(xpath = "//span[@class='grid-header-cell__label'][normalize-space()='Date']")
    public WebElement dateColumnName;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/thead/tr/th[1]/div/button/input")
    public WebElement checkbox;

    @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[1]/td[1]")
    public List<WebElement> checkbox1;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[2]/td[1]")
   public List<WebElement> checkbox2;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[3]/td[1]")
   public List<WebElement> checkbox3;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[4]/td[1]")
   public List<WebElement> checkbox4;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[5]/td[1]")
   public List<WebElement> checkbox5;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[6]/td[1]")
   public List<WebElement> checkbox6;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[7]/td[1]")
   public List<WebElement> checkbox7;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[8]/td[1]")
   public List<WebElement> checkbox8;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[9]/td[1]")
   public List<WebElement> checkbox9;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[10]/td[1]")
   public List<WebElement> checkbox10;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[11]/td[1]")
   public List<WebElement> checkbox11;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[12]/td[1]")
   public List<WebElement> checkbox12;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[13]/td[1]")
   public List<WebElement> checkbox13;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[14]/td[1]")
   public List<WebElement> checkbox14;
   @FindBy(xpath = "//div[contains(@class,'grid-container')]/table/tbody/tr[15]/td[1]")
   public List<WebElement> checkbox15;

}
