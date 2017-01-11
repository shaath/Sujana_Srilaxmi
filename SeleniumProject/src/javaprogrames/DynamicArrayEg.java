package javaprogrames;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[10];
		
		//Finding the length of the array
		
		System.out.println(x.length);
		
		//Writing the data into array
		
		x[3]=4000;
		x[8]="Selenium";
		x[3]="UFT";
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}
