package class25;

public class WebDriverTester {


    public static void main(String[] args) {


    WebDriver [] webDrivers = {new WebDriver.ChromeDriver(),new WebDriver.FirefoxDriver()};

    for (WebDriver w : webDrivers){

        w.openBrowser();
        w.closeBrowser();
        w.maximizeWindow();
        w.findElement();
    }





    }



}
