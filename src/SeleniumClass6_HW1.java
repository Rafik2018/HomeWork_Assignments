import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumClass6_HW1 {

    public static void main(String[] args) {

       /* HW
        1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
        2.Click on the "Start" button to initiate the loading of a hidden element
        3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
        4.Click the "Finish" button to reveal the hidden element
        5.Verify that the text "Hello World!" is now displayed on the page*/


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//       create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//       max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement strBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        strBtn.click();

        WebElement finBtn = driver.findElement(By.xpath("//div[@id='finish']"));
        finBtn.click();

        WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("Is >Hello Wold< text displayed? " + text.isDisplayed());
        driver.quit();

    }

}
