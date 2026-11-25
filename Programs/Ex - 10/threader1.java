import java.util.Random;
class threader1 implements Runnable
{
    @Override
    public void run()
    {
        Random r = new Random();
        for (int i=0; i<5; i++)
        {
            int n = r.nextInt(20);
            System.out.println("Generated No: " + n);
            if (n % 2 == 0)
            {
                even e = new even(n);
                e.start();
            }
            else
            {
                odd o = new odd(n);
                o.start();
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class even extends Thread
{
    int n;
    even(int n)
    {
        this.n = n;
    }
    @Override
    public void run()
    {
        System.out.println("Square of " + n + " is " +(n*n));
    }
}
class odd extends Thread
{
    int n;
    odd(int n)
    {
        this.n = n;
    }
    @Override
    public void run()
    {
        System.out.println("Cube of " + n + "  " + (n*n*n));
    }
}
class Thd
{
    public static void main(String[] args)
    {
        threader1 obj = new threader1();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
