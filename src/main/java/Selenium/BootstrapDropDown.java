package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hdfcbank.com/");

        driver.findElement(By.xpath("//div[@class='drp1']")).click();
        List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
        selectOptionFromDropDown(productTypes,"Accounts");

        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
        List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
        selectOptionFromDropDown(products,"Savings Accounts");

    }
    public static void selectOptionFromDropDown(List<WebElement> options, String value){
        for (WebElement option:options) {
            if (option.getText().equals(value)){
                option.click();
                break;
            }
        }
    }

}
