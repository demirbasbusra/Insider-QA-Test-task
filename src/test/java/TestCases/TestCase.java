package TestCases;

import Pages.CareersPage;
import Pages.HomePage;
import Pages.QualityAssurancePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestCase {
    WebDriver driver;

    @BeforeTest
    public void testtenOncekiAdimlar() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void islemler() {
        driver.get("https://useinsider.com/");

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of CareersPage
        CareersPage careers = new CareersPage(driver);

        //Creating object of QualityAssurancePage
        QualityAssurancePage qualityAssurance = new QualityAssurancePage(driver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        home.clickCookieAccept();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click on More button
        home.clickMore();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click on Careers part
        home.clickCareers();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // On careers page firstly scroll :
        careers.scrollDownForOurLocations();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        careers.scrollUpSeeAllTeams();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        careers.clickseeAllTeams();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        careers.scrollDownForQualityAssurance();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        careers.clickQualityAssuranceImage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        qualityAssurance.clickAllQAJobsButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //  qualityAssurance.clickFilterAll();

        //qualityAssurance.checkEmpty();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        qualityAssurance.scrollDownForJobResults();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        qualityAssurance.clickJobName();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        qualityAssurance.clickViewRole();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By applyForJobButton = By.xpath("//div[@class='postings-btn-wrapper']//a[@class='postings-btn template-btn-submit shamrock'][normalize-space()='Apply for this job']");

        Set<String> allWindowHandles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String actual : allWindowHandles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                //Switch to the opened tab
                driver.switchTo().window(actual);
                //opening the URL saved.
                driver.get(String.valueOf(applyForJobButton));
                //Click  “Apply Now” button
                driver.navigate().to("https://jobs.lever.co/useinsider/0ba4065b-955a-4661-ad4a-f32479f63757");
                //switch with the help of actions class
                Actions action = new Actions(driver);
                action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); //opening the URL saved.
                driver.findElement(applyForJobButton).click();
                driver.close();

            }

        }


      /*  @AfterTest
        public void testSonrasiAdimlar(){
                //Close browser instance
                 driver.quit();
        }
*/

    }
}
