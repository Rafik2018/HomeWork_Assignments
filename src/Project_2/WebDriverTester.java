package Project_2;

public class WebDriverTester {

    public static void main(String[] args) {


        RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};

        for (RemoteWebDriver driver : remoteWebDrivers) {
            driver.open();
            driver.close();
            driver.navigate();
            driver.getTitle();

        }
        System.out.println("---------------------------------------------------------------");

        WebDriver[] webDrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (WebDriver driver : webDrivers) {
            driver.open();
            driver.close();
            driver.getTitle();
        }


    }
}






