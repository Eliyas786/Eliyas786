

class New 
{
String name;
String last;
String add;
int age;
int soft;
int net;
int eng;
double total;
double avg;

New (String n,String l,String a,int ag,int s,int ne,int en)
{
	name = n;
	last = l;
	add = a;
	age = ag;
	soft = s;
	net = ne;
	eng = en;
	total = soft+net+eng;
	avg = total/3;
}


void printAll()
{
	System.out.println("------------------------------------------");
	System.out.println("Name:"+name);
	System.out.println("Last name:"+last);
	System.out.println("Age:"+age);
	System.out.println("Address:"+add);
	System.out.println("Software marks:"+soft);
	System.out.println("Network marks:"+net);	
	System.out.println("English marks:"+eng);	
	System.out.println("Total  marks:"+total);	
	System.out.println("Average marks:"+avg);	
	if (avg>=90)
	{
		System.out.println("You rock!");
	
	}
	else if (avg>=80)
	{
		System.out.println("You are not bad");
	}
	else if (avg>=70)
	{
		System.out.println("Its okay");
	}
else {
	System.out.println("Better to be careful");
}
	
}


}