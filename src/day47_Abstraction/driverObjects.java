package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {
        String URL = "https://www.google.com";
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get(URL);
        driver1.quit();

        System.out.println("================================");
        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.firefox.com");
        driver2.quit();

        System.out.println("================================");
        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.opera.com");
        driver3.quit();


    }


}
