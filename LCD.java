
import java.util.Scanner;
class LCD
{

String corp = "SAMSUNG";
String clr = "Blue";
static String size = "52 Inch";
static int Speakers = 2;
boolean On = false;

void ShDetails()
{
	System.out.println("Company name:"+corp);
	System.out.println("TV color:"+clr);
	System.out.println("TV size in inch:"+size);
	System.out.println("Number of speakers:"+Speakers);
	System.out.println("Is TV ON ?"+On);
}

void lop()
{
	for (char i = 'A'; i<='Z'; i++)
	{
		System.out.print(i+" ");
	}
	
	
}

void Input()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name:");
	String name = s.nextLine();
	System.out.println("Name:"+name);
}
void ShAll()
{
	ShDetails();
	lop();
	Input();
	
	
	
}
















}