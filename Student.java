


class Student
{

String name = "Elyas";
String lastName = "Osmani";
static int age = 19;
static int year = 2021;
static long id = 20121212;


void printNames()
{
	System.out.println("My name is:"+name);
	System.out.println("My last name is:"+lastName);
	
}
static void StaticVars()
{
	System.out.println("My age:"+age);
	System.out.println("This year is :"+year);
	System.out.println("My imaginary id is:"+id);
}

static void ShowAll()
{
	Student st = new Student();
	st.printNames();
	st.StaticVars();
}





}