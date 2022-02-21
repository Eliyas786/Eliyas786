import java.util.Scanner;

class AskStudInf

{
	
String name;
String lastN;
int id;
int age;
String temp;
String con;
String adds;
String mj;
	
	void AskDetails()
	{
Scanner sc = new Scanner(System.in);	
System.out.print("Student name:");
name = sc.nextLine();
System.out.print("Student last name:");
lastN = sc.nextLine();
System.out.print("Student ID:");
id = sc.nextInt();
System.out.print("Student age:");
age = sc.nextInt();
temp = sc.nextLine();
System.out.print("Student contact:");
con = sc.nextLine();
System.out.print("Student address:");
adds = sc.nextLine();
System.out.print("Student major:");
mj = sc.nextLine();
TransferStudent ts = new TransferStudent();
ts.PrintS(name,lastN,id,age,con,adds,mj);
	
	}






}