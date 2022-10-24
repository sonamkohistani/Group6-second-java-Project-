package Grop6;

 interface WebDriver {
     void open();
     void close();
     String getTitle();
 }

interface remoteWebDriver extends WebDriver{
    void navigate();
}

interface takeScreenShot extends WebDriver{
    void getScreenShot();
}

class ChromeDriver implements remoteWebDriver, takeScreenShot{

    @Override
    public void open() {
        System.out.println("opening the chrome browser");
    }

    @Override
    public void close() {
        System.out.println("closing the chrome browser");
    }

    @Override
    public String getTitle() {
        return "getting title from the Chrome browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to URL from Chrome browser");

    }

    @Override
    public void getScreenShot() {
        System.out.println("taking screenshots from Chrome");
    }
}

class FirefoxDrive implements remoteWebDriver, takeScreenShot{
    @Override
    public void open() {
        System.out.println("opening the Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("closing the Firefox browser");
    }

    @Override
    public String getTitle() {
        return "getting title from the Firefox browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to URL from Firefox browser");

    }

    @Override
    public void getScreenShot() {
        System.out.println("taking a screenshot from FireFox");
    }
}

class SafariDriver implements remoteWebDriver,takeScreenShot{
    @Override
    public void open() {
        System.out.println("opening the Safari browser");
    }

    @Override
    public void close() {
        System.out.println("closing the Safari browser");
    }

    @Override
    public String getTitle() {
        return "getting title from the Safari browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to URL from Safari browser");

    }

    @Override
    public void getScreenShot() {
        System.out.println("taking screenshots from Safari");
    }
}
class WebDriverTester{
    /*
   Provide Implementation for the diagram below. Then create a test class in which you
    need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver classes
    and see which methods available to them.
   */
    public static void main(String[] args) {
        remoteWebDriver [] webDriver={ new ChromeDriver(),new FirefoxDrive(), new SafariDriver()};

        for (remoteWebDriver driver:webDriver){
            driver.open();
            driver.close();
            System.out.println(driver.getTitle());
            driver.navigate();
            System.out.println();

        }

    }
}
