package video255javaprogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashset {

	public static void main(String[] args) 
	{
		
		HashSet<String> s= new HashSet<String>();
		s.add("Shriya");
		s.add("Pooja");
		s.add("Harsh");
		s.add("Surojit");
		System.out.println(s);
		//s.remove("Pooja");
		//System.out.println(s);
		Iterator<String> hs=s.iterator();
		while (hs.hasNext())
		{
			System.out.println(hs.next());
			
		}
	}

}
