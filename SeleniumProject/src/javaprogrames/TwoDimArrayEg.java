package javaprogrames;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		

		System.out.println("The Number of rows "+x.length);
		
		System.out.println("The Number of Columns "+x[1].length);
		
		
		//Writing the data into the array
		
		x[0][2]="Selenium";
		x[1][1]="UFT";
		
		//Reading the data into an arrray
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
				
			}
			
		}
		
	}

}
