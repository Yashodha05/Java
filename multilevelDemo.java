package Week8;


class vehicle
{
	protected String vehicleType;
	private int maxSpeed;
	vehicle (int mSpeed)
	{
		maxSpeed=mSpeed;
	}
	public void Speed()
	{
		System.out.println("it can cruise up to maximum speed of "+ maxSpeed+"km/hour");
		}
}
class Toyata extends vehicle
{
	protected String brand;
	Toyata(int mSpeed)
	{
		super (mSpeed);
	}
}
class Fortuner extends Toyata
{
	private String model;
	Fortuner(String vType, int ms, String br,String mod)
	{
		super(ms);
		vehicleType=vType;
		model=mod;
		brand=br;
	}
	public void display()
	{
		System.out.println("The name of the vehicle is "+model);
		System.out.println("it's brand is "+brand);
		System.out.println("The type of the vehicle is "+vehicleType);
		this.Speed();
	}
}
public class multilevelDemo
{
	public static void main (String arge[])
	{
		Fortuner sigma = new Fortuner ("Four wheeler",280,"Toyata","Fortuner");
		sigma.display();
		}
}

