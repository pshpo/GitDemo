package video255javaprogram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args)
	{
 
		Date d= new Date();
	    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	    System.out.println(f.format(d));
	    System.out.println(d.toString());
		
	}

}
