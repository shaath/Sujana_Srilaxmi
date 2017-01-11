package javaprogrames;

import java.util.Scanner;

public class SwitchCaseEg
{

	public static void main(String[] args) 
	{
//		String course="UFT";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course value");
		String course=sc.next();
		
		switch(course)
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "LoadRunner":
			System.out.println("You are selected Lad Runner");
			break;
		default:
			System.out.println("Select a proper course");
			break;
			
		
		}

	}

}
