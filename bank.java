// Develop a Java program to create a class Bank that maintains two kinds of account for its
// customers, one called savings account and the other current account. The savings account
// provides compound interest and withdrawal facilities but no cheque book facility. The current
// account provides cheque book facility but no interest. Current account holders should also
// maintain a minimum balance and if the balance falls below this level, a service charge is
// imposed.
// Create a class Account that stores customer name, account number and type of account. From
// this derive the classes Curr-acct and Sav-acct to make them more specific to their
// requirements. Include the necessary methods in order to achieve the following tasks:
//  Accept deposit from customer and update the balance.
//  Display the balance.
//  Compute and deposit interest
//  Permit withdrawal and update the balance
//  Check for the minimum balance, impose penalty if necessary and update the balance.

import java.util.*;
import javax.print.event.PrintEvent;

class Curr_acct extends Account

{
    void deposit(int x)
    {
        totalAmount += x;
    }
    void withdraw(int x)
    {
        totalAmount -= x;
    }
    void interest(int time, int no) {
        double intr = totalAmount * (1 + 6 / no);
        intr = Math.pow(intr, (time * no));
       System.out.println("Intertest calculated is" + intr);
       totalAmount = totalAmount + (int)intr;
        System.out.println("The new balance is" + totalAmount);
    }
    
    void check(double amt) {
        if (amt < 10000) {
            totalAmount = totalAmount - 500;
            System.out.println("Insufficient Balance" + totalAmount);
        }
    }

}
class Sav_acct extends Account
{
    void deposit(int x)
    {
        totalAmount += x;
    }
    void withdraw(int x)
    {
        totalAmount -= x;
    }
    void interest(int time, int no) {
        double intr = totalAmount * (1 + 6 / no);
        intr = Math.pow(intr, (time * no));
       System.out.println("Intertest calculated is" + intr);
       totalAmount = totalAmount + (int)intr;
        System.out.println("The new balance is" + totalAmount);
    }
    
    void check(double amt) {
        if (amt < 10000) {
            totalAmount = totalAmount - 500;
            System.out.println("Insufficient Balance" + totalAmount);
        }
    }
}

class Account
{
    String name,accType;
    int accountNum,totalAmount;

    void getdata(String name, String accType,int accountNum, int totalAmount)
    {
        this.name = name;
        this.accType = accType;
        this.accountNum = accountNum;
        this.totalAmount = totalAmount;
    }


}

class start
{
    public static void main(String args[]) 
    {
        String name, accType;
        int initialAmount,accountNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your name : ");
        name = sc.nextLine();
        System.out.print("Enter the total amount : ");
        initialAmount = sc.nextInt();
        System.out.print("Enter the account number : ");
        accountNum = sc.nextInt();
        System.out.print("Enter the account type : ");
        accType = sc.nextLine();
    }
}
