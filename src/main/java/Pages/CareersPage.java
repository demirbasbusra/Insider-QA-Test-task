package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {

    static WebDriver driver;
    static WebElement elementOurLocations;
    static WebElement elementQualityAssurance;


    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    //Diğer kısımları görebilmek için ekranı aşağıya kaydır :
    //JavascriptExecutor jsx = (JavascriptExecutor) driver;
    //jsx.executeScript("window.scrollBy(0,250)");


    public static void scrollDownForOurLocation(){
        //Sayfada istenen Locations,  Teams and Life at Insider kısımları görmek için sayfayı aşağı kaydırıyoruz
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,700)");
        elementOurLocations = driver.findElement(By.xpath("//h3[@class='category-title-media ml-0']"));  //Our Locations kısmına inecek
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementOurLocations);
    }


    //Locator for Locations field
    By seeAllTeamsButton = By.cssSelector(".btn.btn-outline-secondary.rounded.text-medium.mt-5.mx-auto.py-3.loadmore");

    //Method to click on SEE ALL TEAMS button
    public void clickseeAllTeams() {
        driver.findElement(seeAllTeamsButton).click();
    }

    public static void scrollDownForQualityAssurance(){
        //Sayfada istenen Quality Assurance başlığının olduğu kısmı görmek için sayfayı aşağı kaydırıyoruz
        elementQualityAssurance = driver.findElement(By.xpath("//h3[normalize-space()='Quality Assurance']"));  //Quality Assurance kısmına inecek
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementQualityAssurance);
    }

}
