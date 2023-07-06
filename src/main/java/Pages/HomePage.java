package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    By MoreBtn = By.xpath("//span[normalize-space()='More']");
    By CareerBtn = By.xpath("//h5[normalize-space()='Careers']");

    //Method to click MORE button
    public void clickMore() {
        driver.findElement(MoreBtn).click();
    }

    //Method to click Careers header
    public void clickCareers() {
        driver.findElement(CareerBtn).click();
    }

}
