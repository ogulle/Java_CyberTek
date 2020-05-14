package day39_AccessModifiers;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String model){
        this(brand);
        //this.brand = brand;
        this.model = model;
    }
    public Car(String brand, String model, int year){
        this(brand,model);
        this.year = year;
    }
    public Car(String brand, String model, int year, double price){
        this(brand,model,year);
        this.price = price;
    }
    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
    }

}
