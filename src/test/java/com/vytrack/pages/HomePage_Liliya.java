package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_Liliya extends BasePage {

    public HomePage_Liliya() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Marketing']")
    public WebElement marketingModule;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activitiesModule;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicle Contracts']")
    public WebElement contractsOption;

    @FindBy(xpath = "(//div[@class='message'])[1]")
    public WebElement message1;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement message2;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Campaigns']")
    public WebElement campaignsOption;

    @FindBy(css = "div[class='btn-group']")
    public WebElement createCalendarEventsButton;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Calendar Events']")
    public WebElement calendarEvents;

    @FindBy(id = "oro_calendar_event_form_description-uid-6402b9c6ca44d_ifr")
    public WebElement descriptionBox;

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']")
    public WebElement manageFilters;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filters;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']")
    public WebElement dropdown;


}
