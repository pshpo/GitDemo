package video255javaprogram;

public class pchild extends parentaircraft
{
	public static void main(String[] args)
	{
		pchild pc= new pchild();
		pc.color();
		pc.engine();
		pc.safety();
	}

	@Override
	public void color() 
	
	{
      System.out.println("Red color");		
	}

}
