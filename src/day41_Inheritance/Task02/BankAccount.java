package day41_Inheritance.Task02;
/*
create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
 */
public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(double amount){
        balance += amount;
    }
    public void showBalance(){
        System.out.println("Your Balance: $"+balance);
    }
    public String toString(){
        return "Account Number:"+accountNumber+", Account Holder:"+accountHolder+", Balance: $"+balance;
    }


}
