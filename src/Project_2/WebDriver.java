package Project_2;

    public interface WebDriver {
        void open();
        void close();
        String getTitle();
    }
    interface RemoteWebDriver extends WebDriver{
        void navigate();
    }
    interface TakesScreenShot extends RemoteWebDriver{
        void getScreenShot();
    }
    class ChromeDriver implements RemoteWebDriver{

        @Override
        public void open() {
            System.out.println("Open Chrome");
        }

        @Override
        public void close() {
            System.out.println("Close Chrome");
        }

        @Override
        public String getTitle() {
            return "www.google chrome.com";
        }

        @Override
        public void navigate() {
            System.out.println("Navigate using Chrome");
        }
    }
    class FireFoxDriver implements RemoteWebDriver{
        @Override
        public void open() {
            System.out.println("Open FireFox");
        }

        @Override
        public void close() {
            System.out.println("Close FireFox");
        }

        @Override
        public String getTitle() {
            return "www.firefox.com";
        }

        @Override
        public void navigate() {
            System.out.println("Navigate using FireFox");
        }
    }
    class SafariDriver implements RemoteWebDriver{
        @Override
        public void open() {
            System.out.println("Open Safari");
        }

        @Override
        public void close() {
            System.out.println("Close Sarari");
        }

        @Override
        public String getTitle() {
            return "www.safari.com";
        }

        @Override
        public void navigate() {
            System.out.println("Navigate using Safari");
        }
    }




