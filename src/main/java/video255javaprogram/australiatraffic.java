package video255javaprogram;

public class australiatraffic implements centraltraffic {

	public static void main(String[] args)
	{
		australiatraffic at =new australiatraffic();
		centraltraffic ct =new australiatraffic();

		ct.flashyellow();
		at.walk();
	}

	@Override
	public void greengo()
	{
		System.out.println("Go");
	}

	@Override
	public void redstop()
	{
		System.out.println("Stop");

	}

	@Override
	public void flashyellow() 
	{
		System.out.println("Flash");

	}
	public void walk() 
	{
		System.out.println("Walk");

	}
}
