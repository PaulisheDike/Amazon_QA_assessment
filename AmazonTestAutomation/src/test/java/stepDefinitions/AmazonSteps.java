package stepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.AmazonPage;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AmazonSteps {

    private WebDriver driver;
    public static WebDriverWait wait;
    private AmazonPage amazonPage;
    String baseUrl = "https://www.amazon.com/";

    @Before
    public void setup(){
        initializeDriver();
    }

    @After
    public void teardown(){
        closeDriver();
    }

    @Given("I open Amazon website")
    public void i_open_amazon_website() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(baseUrl);
        amazonPage = new AmazonPage(driver);
//        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the hamburger menu")
    public void i_click_on_the_hamburger_menu() {
        // Write code here that turns the phrase above into concrete actions

        amazonPage.clickHamburgerMenu();
//        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Computers")
    public void i_click_on_computers() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.clickComputerSubMenu();
//        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Tablet Accessories")
    public void i_click_on_tablet_accessories() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.clickTabAccessoriesSubMenu();
//        throw new io.cucumber.java.PendingException();
    }
    @When("I filter the results by JETech")
    public void i_filter_the_results_by_JETech() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.clickFilterByBrandJETech();
//        throw new io.cucumber.java.PendingException();
    }
    @When("I sort the JETech results with {string}")
    public void i_sort_the_JETech_results_by_newest_arrivals(String string) {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.clickDropdownButton();
        amazonPage.clickSortByNewestArrivals();
//        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the lowest priced item")
    public void i_click_on_the_lowest_priced_item() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.clickLowestPricedItem();
//        throw new io.cucumber.java.PendingException();
    }
//    @When("I switch the window")
//    public void i_switch_the_window() {
//        // Write code here that turns the phrase above into concrete actions
//
//        throw new io.cucumber.java.PendingException();
//    }
    @Then("I assert that {string} section is present")
    public void i_assert_that_section_is_present(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(amazonPage.isAboutThisItemSectionVisible());
//        throw new io.cucumber.java.PendingException();
    }

    private void initializeDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private void closeDriver() {
        try {
            if (driver != null) {
                driver.quit();
                System.out.println("Teardown successful");
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during the teardown process
            e.printStackTrace();
        }
    }


}
