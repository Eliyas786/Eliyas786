

class Academy 
{
String AcaN = "Entech Aca.";
static  int Nclass = 8;
static String Address ="Herat";
String Time = "Different times";


void PrintDetails()
{
	System.out.println("Name:"+AcaN);
	System.out.println("Number of classes"+Nclass);
	System.out.println("Adress:"+Address);
	System.out.println("Course time:"+Time);
}

void RegistertoCourses()
{
	System.out.println("First register yourself to your desired class.");
	System.out.println("Class registed : JAVA");
}
void  Pay()
{
	System.out.println("Pay the course fee");
}
 static void AttendClass()
{
	System.out.println("Come at 9 AM");
}
void leaveClass()
{
	System.out.println("Leave class at 10 AM");
}
static void SubmitAssignments()
{
	System.out.println("Submit your daily homework before deadline.");
	
}

void Practice()
{
	System.out.println("Practice your lessons");
}

void PrintAll()
{
	System.out.println("------**********---------------");
	PrintDetails();
	System.out.println("-------***********--------------");
	RegistertoCourses();
	System.out.println("---------------------");
	Pay();
	System.out.println("---------------------");
	AttendClass();
	System.out.println("---------------------");
	leaveClass();
	System.out.println("---------------------");
	SubmitAssignments();
	System.out.println("-----**********----------------");
	Practice();
	System.out.println("------*********---------------");
}


}