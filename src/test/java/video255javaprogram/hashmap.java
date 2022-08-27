package video255javaprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args)
	{
        HashMap<Integer,String>hm= new HashMap<Integer,String>();
        hm.put(0, "Pooja");
        hm.put(1, "Sid");
        hm.put(2, "Harsh");
        hm.put(3, "Ankita");
        hm.put(4, "vinita");
        Set<Entry<Integer, String>> s=hm.entrySet();
        Iterator<Entry<Integer, String>> p=s.iterator();
        while(p.hasNext())
        {
        	Entry<Integer, String> e=p.next();
        	System.out.println(e.getKey()+" "+e.getValue());
        }

	}

}
