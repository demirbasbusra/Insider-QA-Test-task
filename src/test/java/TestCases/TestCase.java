package TestCases;

import Pages.CareersPage;
import Pages.HomePage;
import Pages.QualityAssurancePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
    WebDriver driver;
    @BeforeTest
    public void testtenOncekiAdimlar()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

        @Test
        public void islemler(){
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
                qualityAssurance.clickApplyForJob();
        }

      /*  @AfterTest
        public void testSonrasiAdimlar(){
                //Close browser instance
                 driver.quit();
        }
*/

}
