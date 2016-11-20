package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by ASUS PC on 20.11.2016.
 */
public class IsElementPresent {
    WebDriver driver;
    public void findElement(By by){
        By selector = By.id("selector");
        boolean present;
        try{
            driver.findElement(selector);
            present = true;
        }catch (NoSuchElementException e){
            present = false;
            //System.out.println("No such element, wrong locator");
        }
    }
}
