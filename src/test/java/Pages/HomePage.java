package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    By cookieAcceptBtn = By.cssSelector("#wt-cli-accept-all-btn");
    By MoreBtn = By.xpath("//span[normalize-space()='More']");
    By CareerBtn = By.xpath("//h5[normalize-space()='Careers']");

    //Firstly click to Accept Cookie Button
    public void clickCookieAccept() {
        driver.findElement(cookieAcceptBtn).click();
    }

    //Method to click MORE button
    public void clickMore() {
        driver.findElement(MoreBtn).click();
    }

    //Method to click Careers header
    public void clickCareers() {
        driver.findElement(CareerBtn).click();
    }

}
