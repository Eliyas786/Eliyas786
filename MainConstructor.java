import java.util.Scanner;
class MainConstructor
{
public static void main(String[]args)
{
	String name;
	String last;
	String e;
	String add;
	int age;
	int soft;
	int net;
	int eng;
	int total;
	int avg;
	
	Scanner s = new Scanner(System.in);
	Constructor ct = new Constructor(name,last,add,age,soft,net,eng);
	ct.printDetails();
	System.out.print("Enter your name:");
	name = s.nextLine();
	System.out.println("Enter your last name:");
	last = s.nextLine();
	e = s.nextLine();
	System.out.print("Enter your address:");
	add = s.nextLine();
	System.out.print("Enter your age:");
	age = s.nextInt();
	System.out.print("Enter your software marks:");
	soft = s.nextInt();
	System.out.print("Enter your Engli marks:");
	eng = s.nextInt();
	System.out.print("Enter your network marks:");
	net = s.nextInt();
	
	
	Constructor ct2 = new Constructor(name,last,add,age,soft,net,eng);
	ct2.printDetails();
	System.out.println("Enter your name:");
	name = s.nextLine();
	System.out.println("Enter your last name:");
	last = s.nextLine();
	System.out.println("Enter your address:");
	add = s.nextLine();
	System.out.println("Enter your age:");
	age = s.nextInt();
	System.out.println("Enter your software marks:");
	soft = s.nextInt();
	System.out.println("Enter your Engli marks:");
	eng = s.nextInt();
	System.out.println("Enter your network marks:");
	net = s.nextInt();
	
	
	
	
	
	
	
	
	
	
	
}



}