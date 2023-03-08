package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage_AA extends BasePage {
    public MainModulesPage_AA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Dashboards']")
    public WebElement dashboards;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleet;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Customers']")
    public WebElement customers;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Sales']")
    public WebElement sales;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activities;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Marketing']")
    public WebElement marketing;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Reports & Segments']")
    public WebElement reportsSegments;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='System']")
    public WebElement system;











}


