package week19_01_14_2023.selenium_drivers;

public class TestDrivers {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");

        driver=new FirefoxDriver();
        driver.get("https://www.google.com");

        ((TakeScreeShot)driver).getScreenshot();
        ((JavaScriptExecuter)driver).executeScript("exampleeeeeeee");



    }
}
