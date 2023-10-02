package com.interview.pages;

import com.github.javafaker.Faker;
import com.interview.utilities.BrowserUtils;
import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class CreditBasicsPage {

    public CreditBasicsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName="h1")
    public WebElement header;

    @FindBy(xpath="//title[.='Your Credit Journey Starts Here | Fannie Mae']")
    public WebElement title;




}
