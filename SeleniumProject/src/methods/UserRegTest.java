package methods;

public class UserRegTest {

	public static void main(String[] args)
	{
		OrangeHRMMaster om=new OrangeHRMMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Sharath Chandra", "SharathChandra123", "SharathChandra123", "SharathChandra123");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

	}

}
