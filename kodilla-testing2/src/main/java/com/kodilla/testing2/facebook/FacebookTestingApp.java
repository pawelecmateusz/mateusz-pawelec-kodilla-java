package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        final String XPATH_COOKIES = "//div[contains(@class, \"_al64\")]/button[1]";
        final String XPATH_NEW_ACC = "//div[contains(@class, \"_6ltg\")]//a[contains(@class, \"_42ft\")]";
        final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
        final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
        final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";
        final String XPATH_WAIT_FOR_BUTTON = "//button[1]";

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_BUTTON)).isDisplayed()) ;

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookies.click();

        WebElement newAcc = driver.findElement(By.xpath(XPATH_NEW_ACC));
        newAcc.click();

        Thread.sleep(1000);

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(selectComboDay);
        selectBoard.selectByIndex(9);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(4);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByIndex(14);
    }
}