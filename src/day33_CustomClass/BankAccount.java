package day33_CustomClass;
/*
    practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance: " + balance);
    }
    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        if(balance<=0){
            System.out.println("You have no money in your account!");
        }
        else if(amount>balance){
            System.out.println("You do not have balance to withdraw this much amount!");
        }
        else {
            balance -= amount;
        }
    }
    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }
    public String toString(){
        String result = "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAvailable Balence: "+ balance;
        return result;
    }







}
