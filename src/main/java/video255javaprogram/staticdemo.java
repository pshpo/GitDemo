package video255javaprogram;

public class staticdemo 
{
  String name ;
  String address;
  static String city="bangalore";
  static int i=0;
  
  
  public staticdemo(String a, String b)
  {
	  this.name=a;
	  this.address=b;
	  i++;
	  System.out.println(i);
  }
  
  
  public void getAddress()
  {
	  System.out.println(address+" "+city);

  }
	public static void main(String[] args) 
	{
		staticdemo st= new staticdemo("Bob","AP");
		staticdemo st1= new staticdemo("Rahul","CP");
		st.getAddress();
		st1.getAddress();
		System.out.println("Value of i :"+staticdemo.i);
		staticdemo.i=6;
		staticdemo st2= new staticdemo("Rahul","CP");
		st2.getAddress();

		
		

	}

}
