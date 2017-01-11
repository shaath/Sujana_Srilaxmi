package javaprogrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEg {

	public static void main(String[] args) 
	{
		Set<Object> s=new HashSet<Object>();
		
		s.add("Selenium");
		s.add("UFT");
		s.add("Apple");
		s.add("Ball");
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext()) 
		{
			
//			System.out.println(data);
		}
		

	}

}
