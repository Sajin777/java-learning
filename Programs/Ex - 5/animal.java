public class animal
{
    void print()
    {
        System.out.println("I am Animal");
    }
}
class dog extends animal
{
    @Override
    void print()
    {
        System.out.println("I am dog");
    }
}
class cat extends animal
{
    @Override
    void print()
    {
        System.out.println("I am cat");
    }
}
class identity
{
    public static void main(String[] args)
    {
        animal a=new animal();
        a.print();
        dog d=new dog();
        a=d;
        a.print();
        animal c=new cat();
        a=c;
        a.print();
    }
}