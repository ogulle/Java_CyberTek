package day11_ScannerContinue;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "Chrome";

        switch (browserName) {
            case "Chrome":
                System.out.println("Chrome");
                break;
            case "Firefox":
                System.out.println("Firefox");
                break;
            case "Opera":
                System.out.println("Opera");
                break;
            case "Safari":
                System.out.println("Safari");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }

    }
}
