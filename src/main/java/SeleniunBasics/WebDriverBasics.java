package SeleniunBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

    public static void main(String[] args) {
        //1. chromeDriver
        System.setProperty("webdriver,chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //launch browser

        //2. geckodriver
      //  System.setProperty("webdriver,gecko.driver","drivers/geckodriver.exe");
       // WebDriver driver = new FirefoxDriver(); //launch browser

        driver.get("https://www.google.com"); // enter google.com
        String title = driver.getTitle();
        System.out.println(title);

        //Validation point: Actual Vs Expected
        if(title.equals("Google")){
            System.out.println("CORRECT TITLE");
            }
        else{
            System.out.println("The Title is Incorrect");

        }
        System.out.println(driver.getCurrentUrl());

        driver.quit();


    }
}
