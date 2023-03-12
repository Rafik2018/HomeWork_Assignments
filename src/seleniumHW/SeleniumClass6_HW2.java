package seleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumClass6_HW2 {
/*

1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page

*/

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//      max the window
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.click();
        textBox.clear();
        textBox.sendKeys("Hello World!");
        textBox.getText();
        System.out.println("Text was entered");
        driver.switchTo().defaultContent();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();


    }


}
