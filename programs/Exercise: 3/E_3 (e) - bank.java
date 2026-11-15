import java.util.Scanner;
class bank
{
    private int accno;
    private String holdername;
    private double balance;
    bank(int accno, String holdername, double balance)
    {
        this.accno = accno;
        this.holdername = holdername;
        this.balance = balance;
    }
    void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposit Amount : " +amount);
        }
        else
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
    void withdraw(double amount)
    {
        if(balance - amount >= 1000)
        {
            balance = balance - amount;
            System.out.println("Withdraw Amount : " + amount);
        }
        else
        {
            System.out.println("Minimum balance of 1000 should be maintained.");
        }
    }
    void checkBalance()
    {
        System.out.println("Current Balance : " +balance);
    }
     void display()
    {
        System.out.println("Account Number : " +accno);
        System.out.println("Holder Name : " +holdername);
        System.out.println("Bank Balance : "+balance);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String p;
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        while(bal < 1000)
        {
            System.out.println("Initial Balance should be minimum 1000 !!");
            System.out.print("Enter the Initial Balance: ");
            bal = sc.nextDouble();
        }
        bank b = new bank(acc, name, bal);
        b.display();
        do
        {
            System.out.print("Enter the choice [1.Deposit 2.Withdraw 3. Chk_Balance]: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double dep = sc.nextDouble();
                    b.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double wd = sc.nextDouble();
                    b.withdraw(wd);
                    break;
                case 3:
                    b.checkBalance();
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
            System.out.print("Do you want to continue [Y/N]: ");
            sc.nextLine();
            p=sc.nextLine();
        }while(p.equals("Y") || p.equals("y"));
        b.display();
        sc.close();
    }
}