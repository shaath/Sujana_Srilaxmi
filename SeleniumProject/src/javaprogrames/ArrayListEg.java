package javaprogrames;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		
		//Writing the data into array

		s.add("Selenium");
		s.add("UFT");
		s.add(30000);
		s.add(4444.44);
		s.add(true);
		s.add(30000);
		
		s.add(3, "apple");
		
		System.out.println(s.size());
		
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
			
		}
		
	}

}
