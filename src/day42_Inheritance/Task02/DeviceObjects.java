package day42_Inheritance.Task02;

public class DeviceObjects extends Device{
    public static void main(String[] args) {
        TV tv1 = new TV("Samsung","E250",500,"40 inches");
        tv1.country = "USA";

        System.out.println(tv1);

        Phone phone1 = new Phone("iPhone", "11",1000,"large");
        System.out.println(phone1);

        phone1.call(832812);
        phone1.text(5464);




    }


}
