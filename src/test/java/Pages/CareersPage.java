package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {

    static WebDriver driver;
    static WebElement elementForOurLocations;
    static WebElement elementQualityAssurance;

    static WebElement elementSeeAllTeams;
    By seeAllTeamsButton = By.cssSelector(".btn.btn-outline-secondary.rounded.text-medium.mt-5.mx-auto.py-3.loadmore");
    By qualityAssuranceImg = By.xpath("//a[@href='https://useinsider.com/careers/quality-assurance/']//img[@class='img-fluid mx-auto']");

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    //Diğer kısımları görebilmek için ekranı aşağıya kaydır :
    //JavascriptExecutor jsx = (JavascriptExecutor) driver;
    //jsx.executeScript("window.scrollBy(0,250)");


    public static void scrollDownForOurLocations(){
        //Sayfada istenen Locations,  Teams and Life at Insider kısımları görmek için sayfayı aşağı kaydırıyoruz
        elementForOurLocations = driver.findElement(By.xpath("//h3[@class='category-title-media ml-0']"));  //Our Locations kısmına kadar iniyorum
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementForOurLocations);
    }

    public static void scrollUpSeeAllTeams(){
        //Sayfada istenen Locations,  Teams and Life at Insider kısımları görmek için sayfayı aşağı kaydırıyoruz
        /*elementSeeAllTeams = driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore']"));  //SeeAllTeams kısmına çık
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementSeeAllTeams);*/
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-1000)");
    }

    //Method to click on SEE ALL TEAMS button
    public void clickseeAllTeams() {
        driver.findElement(seeAllTeamsButton).click();
    }

    public static void scrollDownForQualityAssurance(){
        //Sayfada istenen Quality Assurance başlığının olduğu kısmı görmek için sayfayı aşağı kaydırıyoruz
        elementQualityAssurance = driver.findElement(By.xpath("//a[@href='https://useinsider.com/careers/quality-assurance/']//img[@class='img-fluid mx-auto']"));  //Quality Assurance kısmına inecek
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementQualityAssurance);
    }

    public void clickQualityAssuranceImage() {
        driver.findElement(qualityAssuranceImg).click();
    }

}
