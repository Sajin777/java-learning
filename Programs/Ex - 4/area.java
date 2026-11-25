abstract class area
{
    abstract void printarea();
}
class rectangle extends area
{
    double length;
    double width;
    rectangle(float l,float w)
    {
        this.length=l;
        this.width=w;
    }
    @Override
    void printarea()
    {
        System.out.println("Area of rectangle is: " + (length*width));
    }
}
class circle extends area
{
    double radius;
    circle(float r)
    {
        this.radius=r;
    }
    @Override
    void printarea()
    {
        System.out.println("Area of circle is: " + (3.14*radius*radius));
    }
}
class areaTest
{
    public static void main(String[] args)
    {
        rectangle r=new rectangle(5,10);
        r.printarea();
        circle c=new circle(7);
        c.printarea();
    }
}