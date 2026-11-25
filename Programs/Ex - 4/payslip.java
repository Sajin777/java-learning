import java.util.Scanner;
class payslip
{
    double da,hra,pf,clubfund,grossSal,netSal;
    void call(double amt)
    {
        this.da=0.97*amt;         
        this.hra=0.10*amt;   
        this.pf=0.12*amt;            
        this.clubfund =0.001*amt;

    }
    void gross(double amt)
    {
        this.grossSal=amt+da+hra;
        System.out.println("Gross Amount: "+grossSal);
    }
    void net()
    {
        this.netSal = grossSal - (pf + clubfund);
        System.out.println("NET Amount: "+netSal);
    }
}
class employee extends payslip
{
    String name;
    int id;
    void call(String Name, int Id)
    {
        this.name=Name;
        this.id=Id;
        System.out.println("Employee Name: "+name);
        System.out.println("Emplyee Id: "+id);
    }
}
class Salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double amt;
        employee emp = new employee();
        System.out.print("Enter the employee choice [1.Programmer 2.Assistant_Prof 3.Associative_Prof 4.Prof]: ");
        byte choice=sc.nextByte();
        sc.nextLine();
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        payslip ps = new payslip();
        switch(choice)
        {
            case 1:
                {
                    System.out.println("---Programmer PaySlip---");
                    amt=25000;
                    emp.call(name,id); 
                    ps.call(amt);
                    ps.gross(amt);
                    ps.net();
                    break;
                }
            case 2:
                {
                    System.out.println("---Assistant Professor PaySlip---");
                    amt=50000;
                    emp.call(name,id); 
                    ps.call(amt);
                    ps.gross(amt);
                    ps.net();
                break; 
            }
            case 3:
                {
                    System.out.println("---Associative Professor PaySlip---");
                    amt=75000;
                    emp.call(name,id); 
                    ps.call(amt);
                    ps.gross(amt);
                    ps.net();
                    break;
            }
            case 4:
                {
                    System.out.println("---Professor PaySlip---");
                    amt=100000;
                    emp.call(name,id); 
                    ps.call(amt);
                    ps.gross(amt);
                    ps.net();
                    break;
                }
            default:
                {
                    System.out.println("---Invalid Choice---");
                    break;
                }
        }
        sc.close();
    }
}