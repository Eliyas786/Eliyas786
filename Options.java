import java.util.Scanner;
class Options
{
	void AskOpt()
	{
		int opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t1.Student details\n\t2.Teacher details");
		System.out.print("Select an option:");
		opt = sc.nextInt();
		
		
		if (opt==1)
		{
			System.out.println("Here will print student details");
			AskStudInf as = new AskStudInf();
			as.AskDetails();
			
			
			
		}
		else if (opt==2)
		{
			AskTeacherInfo at = new AskTeacherInfo();
			System.out.println("Here will print Teacher details");
			at.askTeacherDeatails();
			
		 
		}
		else 
		{
			System.out.println("Please select the rigth option!!");
		}
		
	}




}