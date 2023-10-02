package com.interview.pages;

import com.interview.utilities.BrowserUtils;
import com.interview.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

    public abstract class BasePage {
        public BasePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }



        /**
         * @return tab name under navigation
         */
        public void getPageSubTitle(String subHeaderName) {
      String locator="//h1[.='"+subHeaderName+"']";
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(locator));
           tabElement.click();

        }


        /**
         * This method will navigate user to the specific module in ... application.
         * For example: if tab is equals to Rent, and module equals to Rental Process,
         * Then method will navigate user to this page:...
         *
         * @param tab
         * @param module
         */
        public void navigateToModule(String tab, String module) {


            String tabLocator = "//li[contains(@class,'primary-nav-item--default')]/a[contains(@href,'"+tab+"')]";
            String moduleLocator = "//li[@class='global-nav__secondary-nav-item']//a[contains(@href,'"+module+"')]";
            try {
                BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
                WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
                WebElement moduleElement = Driver.getDriver().findElement(By.xpath(moduleLocator));
                new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).click(moduleElement).build().perform();
            } catch (Exception e) {
                BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
            }
        }
    }

