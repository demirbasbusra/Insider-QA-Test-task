package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QualityAssurancePage {
    static WebDriver driver;
    static WebDriverWait wait;
    static WebElement elementJobResults;

    public QualityAssurancePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for See All QA Jobs Button field
    By seeAllQAJobsButton = By.cssSelector(".btn.btn-outline-secondary.rounded.text-medium.mt-2.py-3.px-lg-5.w-100.w-md-50");
    By filterAllButton = By.id("select2-filter-by-location-container");
    By filterIstanbul = By.xpath("//span[@id='select2-filter-by-location-container']");
    By empty = By.cssSelector("#resultCounter");
    By jobName = By.xpath("//p[normalize-space()='Software Quality Assurance Engineer (Remote)']");
    By viewRoleButton = By.cssSelector(".btn.btn-navy.rounded.pt-2.pr-5.pb-2.pl-5[href='https://jobs.lever.co/useinsider/0ba4065b-955a-4661-ad4a-f32479f63757']");

    By applyForJobButton = By.xpath("//div[@class='postings-btn-wrapper']//a[@class='postings-btn template-btn-submit shamrock'][normalize-space()='Apply for this job']");


    //Method to click on See All QA Jobs Button
    public void clickAllQAJobsButton() {
        driver.findElement(seeAllQAJobsButton).click();
    }

    //Click for filtering All part
    public void clickFilterAll() {
        driver.findElement(filterAllButton).click();
    }


    //Check presence of jobs list
    public void checkEmpty() {
        wait.until(ExpectedConditions.presenceOfElementLocated(empty));
        driver.findElement(By.cssSelector("#resultCounter"));
    }

    //Sayfayı Job sonuçlarına göre çıkan kısma indirmek için
    public static void scrollDownForJobResults(){
        //js.executeScript("window.scrollBy(0,700)");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
       /* elementJobResults = driver.findElement(By.xpath("//p[normalize-space()='Software Quality Assurance Engineer (Remote)']"));  //Software Quality Assurance Engineer kısmına inecek
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementJobResults);*/
    }

    public void clickJobName(){
        driver.findElement(jobName).click();
    }
    //Click a job detail
    public void clickViewRole() {
        driver.findElement(viewRoleButton).click();
    }


    //Click  “Apply Now” button
    public void clickApplyForJob() {
        driver.findElement(applyForJobButton).click();
    }
}
