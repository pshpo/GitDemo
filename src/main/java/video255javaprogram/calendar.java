package video255javaprogram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar {

	public static void main(String[] args) 
	{
          Calendar  cal= Calendar.getInstance();
  	      SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
  	     System.out.println(f.format(cal.getTime()));
         System.out.println(cal.get(cal.DAY_OF_WEEK));
        System.out.println(cal.get(cal.MINUTE));
        System.out.println(cal.get(cal.AM_PM));
        System.out.println(cal.get(cal.DAY_OF_WEEK_IN_MONTH));
	}

}
