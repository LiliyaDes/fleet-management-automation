package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

public PinbarPage() {


  PageFactory.initElements(Driver.getDriver(), this);
}

  @FindBy (xpath = "//a[.='Learn how to use this space']")
    public WebElement clickPinbarPage;




  @FindBy(xpath = "//h3[.='How To Use Pinbar']")
  public WebElement viewFirstMessage;


  //@FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/p[1]/text()")
  //public String viewSecondMessage;
  //public WebElement viewSecondMessage;

  @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/p[1]")
  public WebElement viewSecondMessage;
  @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/p[2]/img")
  public WebElement imagePin;

//
//  @FindBy (xpath = "//img[@src= '/bundles/oronavigation/images/pinbar-location.jpg']");
//  public WebElement viewImagePin;
}

