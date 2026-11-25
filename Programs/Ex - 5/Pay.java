import java.util.Scanner;
interface Pay
{
    Scanner sc=new Scanner(System.in);
    void pay(double amt);
}
class CreditCard implements Pay
{
    public void pay(double amount)
    {

        System.out.print("Enter the amount spend by creditcard: ");
        double amt = sc.nextDouble();
        System.out.println("Paid Rs." + amt + " using Credit Card");
        amount=amount-amt;
        System.out.println("Remaining amount in Credit Card: Rs." + amount);
    }
}
class UPI implements Pay
{
    public void pay(double amount)
    {
        System.out.print("Enter the amount spend by upi: ");
        double amt=sc.nextDouble();
        System.out.println("Paid Rs." + amt + " using UPI");
        amount=amount-amt;
        System.out.println("Remaining amount in UPI: Rs." + amount);
    }
}
class Cash implements Pay
{
    public void pay(double amount)
    {
        System.out.print("Enter the amount spend by cash: ");
        double amt=sc.nextDouble();
        System.out.println("Paid Rs." + amt + " using Cash");
        amount=amount-amt;
        System.out.println("Remaining amount in Cash: Rs." + amount);
    }
}
class Payment
{
    public static void main(String args[])
    {
        double amount;
        Scanner sc=new Scanner(System.in);
        Pay p = new CreditCard();
        System.out.print("Enter the amount in Credit Card: ");
        amount=sc.nextDouble();
        p.pay(amount);
        p = new UPI();
        System.out.print("Enter the amount in UPI: ");
        amount=sc.nextDouble();
        p.pay(amount);
        p = new Cash();
        System.out.print("Enter the amount in Cash: ");
        amount=sc.nextDouble();
        p.pay(amount);
        sc.close();
    }
}