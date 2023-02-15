package Class25;

public interface WebDriver {


/*

    Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface:
    ChromeDriver and FirefoxDriver.
*/

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();


    class ChromeDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("Open Chrome Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Chrome Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Window in  Chrome Browser");
        }

        @Override
        public void findElement() {
            System.out.println("Find Element in Chrome Browser");
        }
    }


    class FirefoxDriver implements WebDriver{
        @Override
        public void openBrowser() {
            System.out.println("Open  Firefox Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Firefox Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Window in  Firefox Browser");
        }

        @Override
        public void findElement() {
            System.out.println("Find Element in Firefox Browser");
        }
    }






}









