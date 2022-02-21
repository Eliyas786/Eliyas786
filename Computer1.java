import java.util.Scanner;

class Computer1
{
	String model = "DELL";
	static String clr = "Black";
	static String serial = "12E222123";
	boolean LS = true;
	String Ram = "8GB";
	int CPUn = 2;
	
	void printDetails()
	{
		System.out.println("Model:"+model);
		System.out.println("Color:"+clr);
		System.out.println("Sereial number:"+serial);
		System.out.println("Loude speaker:"+LS);
		System.out.println("Ram capacity:"+Ram);
		System.out.println("CPU numbers:"+CPUn);
	}
	void TurnOn()
	{
		System.out.println("Switch the power button");
	}
   static  void boot()
	{
		System.out.println("Press F1 to boot the system");
		
	}
   
    void Login()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your password:");
		String pass = s.nextLine();
		
	}
    static void Desktop()
   {
	   System.out.println("Welcome to home screen");
	   
   }
   
   void TurnOff()
   {
	   System.out.println("To turn of pc please hit power off button");
	   
   }
   
    void shAllMethods()
	{
		printDetails();
		System.out.println("-------------------------");
		TurnOn();
		System.out.println("-------------------------");
		boot();
		System.out.println("-------------------------");
		Login();
		System.out.println("-------------------------");
		Desktop(); 
		System.out.println("-------------------------");
		TurnOff();
	}



}