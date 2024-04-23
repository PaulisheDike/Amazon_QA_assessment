package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AmazonPage {

    private WebDriver driver;
    public static WebDriverWait wait;

    //By Locators


    private By hamburgerMenu = By.xpath("//i[@class='hm-icon nav-sprite']");
//    private By computerSubMenu = By.xpath("//a[@class='hmenu-item']//div[contains(text(),'Computers')]");
    private By computerSubMenu = By.xpath("(//div[contains(text(),'Computers')])[1]");

    private By tableAssessories = By.xpath("//a[normalize-space()='Tablet Accessories']");
    private By JETechBrand = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='JETech']");
    private By sortBylist = By.xpath("//span[@id='a-autoid-0-announce']");
    private By newestArrivals = By.xpath("//a[@id='s-result-sort-select_4']");
    private By lowestPricedItem = By.xpath("//img[@alt='JETech Screen Protector for iPad Air 10.9-Inch (2024 Model, 6th Generation), 9H Tempered Glass Film, HD Clear, 2-Pack']");
    private By aboutThisItemSection = By.xpath("//*[@id='feature-bullets']");

    // Constructor
    public AmazonPage(WebDriver driver){
        this.driver = driver;
    }

    //Page Methods/Actions
    public void clickHamburgerMenu(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hamburgLoc)));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='hm-icon nav-sprite']")));
        WebElement hamburger = driver.findElement(hamburgerMenu);
        hamburger.click();
    }

    public void clickComputerSubMenu(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Computers')]")));
        WebElement computer_submenu = driver.findElement(computerSubMenu);
        computer_submenu.click();
    }

    public void clickTabAccessoriesSubMenu(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Tablet Accessories']")));
        WebElement table_accessories_submenu = driver.findElement(tableAssessories);
        table_accessories_submenu.click();
    }

    public void clickFilterByBrandJETech(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='JETech']")));
        WebElement filter_By_Brand_JETech = driver.findElement(JETechBrand);
        filter_By_Brand_JETech.click();
    }

    public void clickDropdownButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='a-autoid-0-announce']")));
        WebElement dropdown_button = driver.findElement(sortBylist);
        dropdown_button.click();
    }

    public void clickSortByNewestArrivals(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='s-result-sort-select_4']")));
        WebElement newest_arrivals = driver.findElement(newestArrivals);
        newest_arrivals.click();
    }

    public void clickLowestPricedItem(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='JETech Screen Protector for iPad Air 10.9-Inch (2024 Model, 6th Generation), 9H Tempered Glass Film, HD Clear, 2-Pack']")));
        WebElement lowest_priced_item = driver.findElement(lowestPricedItem);
        lowest_priced_item.click();
    }

    public boolean isAboutThisItemSectionVisible(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='feature-bullets']")));
        WebElement about_this_item_section = driver.findElement(aboutThisItemSection);
        String aboutThisItemSectionText = about_this_item_section.getText();
        System.out.println(aboutThisItemSectionText);
        return about_this_item_section.isDisplayed();

    }



}
