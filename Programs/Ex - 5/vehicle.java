interface vehicle
{
	void displayDetails();
}
class Car implements vehicle
{
	String brand, model;
	int speed;
	Car(String brand, String model, int speed)
	{
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}
	public void displayDetails()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Maximum Speed: "+speed+" km/h");
	}
}
class ElectricCar extends Car
{
	private int batteryCapacity;
	ElectricCar(String brand, String model, int speed, int batteryCapacity)
	{
		super(brand, model, speed);
		this.batteryCapacity = batteryCapacity;
	}   
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Battery Capacity: "+batteryCapacity+"k/Wh");
	}
}
class VehicleTest
{
	public static void main(String[] args)
	{
		Car car = new Car("Toyota", "Corolla", 180);
		ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 225, 75);
		System.out.println("--- Petrol Car ---");
		car.displayDetails();
		System.out.println("--- Electric Car ---");
		electricCar.displayDetails();
	}
}
