import java.util.Scanner;


class AskTeacherInfo
{
String name;
String lastN;
int id;
int age;
String temp;
String con;
String adds;
String mj;


	void askTeacherDeatails()
	{
		
Scanner sc = new Scanner(System.in);
System.out.print("Teacher name:");
name = sc.nextLine();
System.out.print("Teacher last name:");
lastN = sc.nextLine();
System.out.print("Teacher id:");
id = sc.nextInt();
System.out.print("Teacher afe:");
age = sc.nextInt();
temp = sc.nextLine();
System.out.print("Teacher contact:");
con = sc.nextLine();
System.out.print("Teacher address:");
adds = sc.nextLine();
System.out.print("Teacher field:");
mj = sc.nextLine();


TransferTeacher tt = new TransferTeacher();
tt.printT(name,lastN,id,age,con,adds,mj);

	}











}