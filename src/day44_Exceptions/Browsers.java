package day44_Exceptions;

public class Browsers {
    public void openBrowser(){
        System.out.println("opening the default browser");
    }
    public void closeBrowser(){
        System.out.println("closing the default browser");
    }
}

class ChromeBrowser extends Browsers{
    @Override
    public void openBrowser() {
        System.out.println("Opening the chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the chrome browser");
    }
}

class FirefoxBrowser extends Browsers{
    @Override
    public void openBrowser() {
        System.out.println("Opening the firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the firefox browser");
    }
}

class Test{
    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();
        System.out.println("==================================");

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();

    }
}
