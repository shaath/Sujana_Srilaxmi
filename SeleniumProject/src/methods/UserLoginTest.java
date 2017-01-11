package methods;

public class UserLoginTest {

	public static void main(String[] args)
	{
		OrangeHRMMaster om=new OrangeHRMMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("SharathChandra123", "SharathChandra123");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

	}

}
