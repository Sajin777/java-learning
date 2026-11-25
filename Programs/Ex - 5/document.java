interface printable
{
    void open();
}
public class document
{
    public void open()
    {
        System.out.println("This is a document");
    }
}
class report extends document implements printable
{
    @Override
    public void open()
    {
        System.out.println("This is a your report");
    }
}
class Main
{
    public static void main(String args[])
    {
        report r=new report();
        r.open();
        printable p=new report();
        p.open();
        document d=new document();
        d.open();
        document m=new report();
        m.open();

    }
}