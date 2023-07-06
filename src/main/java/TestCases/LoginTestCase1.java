package TestCases;

import Pages.CareersPage;
import Pages.HomePage;
import Pages.QualityAssurancePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/busra.demirbas/IdeaProjects/InsiderQATest/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com/");

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of CareersPage
        CareersPage careers = new CareersPage(driver);

        //Creating object of QualityAssurancePage
        QualityAssurancePage qualityAssurance = new QualityAssurancePage(driver);

        Thread.sleep(3000);
        //Click on More button
        home.clickMore();
        //Click on Careers part
        home.clickCareers();

        Thread.sleep(3000);
        // On careers page firstly scroll :
        careers.scrollDownForOurLocation();
        Thread.sleep(3000);
        careers.clickseeAllTeams();
        Thread.sleep(3000);
        careers.scrollDownForQualityAssurance();


        Thread.sleep(3000);
        qualityAssurance.clickAllQAJobsButton();
        Thread.sleep(3000);
        qualityAssurance.clickFilterAll();
        Thread.sleep(3000);
        qualityAssurance.clickFilterIstanbul();
        Thread.sleep(3000);
        qualityAssurance.checkEmpty();
        Thread.sleep(3000);
        qualityAssurance.scrollDownForJobResults();
        Thread.sleep(3000);
        qualityAssurance.clickViewRole();
        Thread.sleep(3000);
        qualityAssurance.clickApplyForJob();


        //Close browser instance
        driver.quit();
    }

}
