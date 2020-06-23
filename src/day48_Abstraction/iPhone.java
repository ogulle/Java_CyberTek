package day48_Abstraction;

public class iPhone extends Phone{
    static {
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }
    @Override
    public void calling(long phoneNumber){
        System.out.println("Calling " + phoneNumber + " with "+brand);
    }
    @Override
    public void texting(long phoneNumber){
        System.out.println("Texting " + phoneNumber + " with "+brand);
    }
    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is face timing with "+phoneNumber);
    }




}
