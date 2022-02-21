import java.util.Scanner;

class MainInfo
{
public static void main(String[]args)
{
	String name;
	String lastName;
	String address;
	int age;
	String temp;
	String ph;
	Info in = new Info();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name:");
	name = sc.nextLine();
	System.out.println("Enter your last name:");
	lastName = sc.nextLine();
	System.out.println("Your address:");
	address = sc.nextLine();
	System.out.println("Your age :");
	age = sc.nextInt();
	System.out.println("Your contact:");
	ph = sc.nextLine();
	in.ShowInfo(name,lastName,address,ph,age);
	
	
	
	
	
}



}