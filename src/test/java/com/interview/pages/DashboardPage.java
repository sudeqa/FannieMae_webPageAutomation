package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='question-select']")
    public WebElement commonQarrow;

    public int list(){
        List<WebElement> count= Driver.getDriver().findElements(By.xpath("//ul[@id='menu-rollover']//li"));
        return count.size();
    }


}



