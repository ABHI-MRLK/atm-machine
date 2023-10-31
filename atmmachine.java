import java.util.*;

class atm
{

    float balance;
    int pin=6191;

    public void checkpin()
    {
        System.out.println("Enter your pin: ");
        Scanner sc =new Scanner(System.in);
        int pinentered=sc.nextInt();

        if(pinentered==pin)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid pin!");
        }
    }

public void menu()
{
    System.out.println("Enter your choice: ");
    System.out.println("1. Check A/c Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. EXIT");

    Scanner sc= new Scanner(System.in);
    int choice=sc.nextInt();

    if(choice==1)
    {
        checkbalance();
    }
    else if(choice==2)
    {
        withdrawmoney();
    }
    else if(choice==3)
    {
        depositmoney();
    }
    else if(choice==4)
    {
        return;
    }
    else
    {
        System.out.println("Enter a valid choice");
    }
}


public void checkbalance()
{
    System.out.println("Balance: "+ balance);
    menu();
}

public void withdrawmoney()
{
    System.out.println("Enter the amount to withdraw: ");
    Scanner sc =new Scanner(System.in);
    float amt=sc.nextFloat();
    if(amt>balance)
    {
        System.out.println("Insufficient Balance");
    }
    else{
        balance-=amt;
        System.out.println("Money withdrawl successful");
    }
    menu();
}

public void depositmoney()
{
    System.out.println("Enter the amount to be deposited: ");
    Scanner sc=new Scanner(System.in);
    float amt=sc.nextFloat();
    balance+=amt;
    System.out.println("Money deposited successfully");
    menu();
}
}

public  class atmmachine
{
    public static void main (String [] args)
    {
        atm obj=new atm();
        obj.checkpin();
    }
}
