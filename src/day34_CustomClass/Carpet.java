package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;


    public void customOrder(double customWidth, double customLength, double customUnitPrice, boolean customIsPersian){
        width = customWidth;
        length = customLength;
        unitPrice = customUnitPrice;
        isPersian = customIsPersian;
    }

    public double calCost(){
        double customTotalPrice = (width*length)*unitPrice;
        if(isPersian) {
            customTotalPrice += 200;
        }
        return customTotalPrice;
    }

    public String toString(){
        String result = "Dimensions(LxW): " + width + " x " + length + ", \nUnit Price: $"
                        + unitPrice + "\nPersian Carpet? " + isPersian + "\nTotal Cost: $" + calCost();
        return result;
    }



}
