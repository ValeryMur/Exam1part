package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 20.11.2016.
 */
public class TopIMDB {
    WebDriver driver;

    @BeforeTest
    public void setUpBrowser() {
        System.out.println("Set up Chrom");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void topIMDB() throws InterruptedException {
        System.out.println("Test");
        driver.get("http://www.imdb.com/chart/top");
        String titleIMDB = "IMDb Top 250 - IMDb";
        Assert.assertEquals(driver.getTitle(), titleIMDB);
        List<WebElement> filmNames = driver.findElements(By.xpath("//tbody//tr/td[@class='titleColumn']/a"));
        List<WebElement> scores =  driver.findElements(By.xpath("//tbody//tr//td/strong"));
        List<String> filteredResult = new ArrayList<>();

        for (int i = 0; i < filmNames.size(); i++) {
           // System.out.println("Film: "  + filmNames.get(i).getText() + ". Score is: " + scores.get(i).getText());
            Double value = Double.parseDouble(scores.get(i).getText().replace(",","."));
            if (value>8.5 && value<9){
                filteredResult.add(filmNames.get(i).getText());
            }
        }
        System.out.println("Фильмы с рейтингом от 8.5 до 9: "+filteredResult);
    }

    @AfterTest
    public void tesrDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
}
