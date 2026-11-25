class Parent
{
    void Message()
    {
        System.out.println("This is the message from the Parent class.");
    }
}
class Child extends Parent
{
    void Message()
    {
        System.out.println("This is the overridden message from the Child class.");
    }
}
class methodride
{
    public static void main(String args[])
    {
        Parent parObj = new Parent();
        parObj.Message(); 
        Child childObj = new Child();
        childObj.Message(); 
        Parent polyObj = new Child();
        polyObj.Message(); 
    }
}