package javaprogrames;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] salary={3000,4000,5000,6000,7000,5000};
		
		//Finding the length of the array
		
		System.out.println(salary.length);
		
		//Read the values from the array
		
		System.out.println(salary[3]);
		
//		for (int i = 0; i < salary.length; i++) 
//		{
//			System.out.println(salary[i]);
//			
//		}
		
		for (int x : salary) 
		{
			System.out.println(x);
		}

	}

}
