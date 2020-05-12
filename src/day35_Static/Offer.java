package day35_Static;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo (String location,String company, double salary, boolean isFullTime){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString(){
        String salary = ""+this.salary;
        //string now can be manipulated

        return "Location: " + location + "\nCompany: " + company + "\nSalary: " + salary + "\nFull Time: " + isFullTime;
    }

}
