interface mobile
{
    void camera();
    void gps();
}

class Smartphone implements mobile
{
    public void camera()
    {
        System.out.println("Camera: Taking a photo");   
    }
    public void gps()
    {
        System.out.println("GPS: Location is being tracked");
    }
}
class test {
    public static void main(String[] args)
    {

        Smartphone ph = new Smartphone();
        ph.camera();
        ph.gps();
    }
}