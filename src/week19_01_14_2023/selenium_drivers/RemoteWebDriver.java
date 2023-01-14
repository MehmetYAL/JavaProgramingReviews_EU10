package week19_01_14_2023.selenium_drivers;

public class RemoteWebDriver implements WebDriver,TakeScreeShot,JavaScriptExecuter{


    @Override
    public void executeScript(String script) {
        System.out.println(" i will execute that " +script);

    }

    @Override
    public void findElement() {
        System.out.println(" Finde the elemets by "+ getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println(" Finde the elemets by "+ getClass().getSimpleName());

    }

    @Override
    public String getScreenshot() {
        return "PNG";
    }

    @Override
    public void get(String url) {
        System.out.println("open the "+ url + " in "+ getClass().getSimpleName());

    }

    @Override
    public void close() {

        System.out.println("close the " + getClass().getSimpleName());

    }
}
