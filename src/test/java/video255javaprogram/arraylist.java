package video255javaprogram;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) 
	{
         ArrayList<String> a= new ArrayList<String>();
         a.add("Pooja");
         a.add(0,"Shriya");
         a.add("Sidd");
         System.out.println(a);
        // a.remove(2);
       //  System.out.println(a);
         Collections.reverse(a);
         System.out.println(a);
        System.out.println(a.contains("pooja"));
        System.out.println(a.indexOf("Pooja"));
        System.out.println(a.size());
	}

}
