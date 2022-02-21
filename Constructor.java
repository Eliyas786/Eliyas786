
class Constructor
{

String name;
String last;
String add;
int age;
int soft;
int net;
int eng;
int total;
int avg;


Constructor (String val,String val2,String val3,int val4,int val5,int val6,int val7)
{
	name = val;
	last = val2;
	add = val3;
	age = val4;
	soft = val5;
	net = val6;
	eng = val7;
	total = soft+net+eng;
	avg = total/3;
}


void printDetails()
{
	System.out.println("------------------------------------------------");
	System.out.println("Name:"+name);
	System.out.println("Last:"+last);
	System.out.println("Address:"+add);
	System.out.println("Age:"+age);
	System.out.println("Soft:"+soft);
	System.out.println("Net:"+net);
	System.out.println("English:"+eng);
	System.out.println("Total:"+total);
	System.out.println("Avg :"+avg);
	System.out.println("---------------------------------------------------");
	
	if (avg>90)
	{
		System.out.println("You are :A+");
	}
	else if (avg<=80)
	{
		System.out.println("You are :B+");
	}	
    else if (avg<=70)
	{
		System.out.println("You are :C");
		
	}	
else 
{
	System.out.println("Failed");
}	
}







}