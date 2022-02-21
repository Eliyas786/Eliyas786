

class ClassAct
{
static String name = "Ahmad";
int year = 2021;



void showName()
{
	ClassAct ca = new ClassAct();
	System.out.println("non-static:"+ca.year);
	System.out.println("Name static: "+name);	
}
 static void ShowYear()
{
	ClassAct ca = new ClassAct();
	System.out.println("non-static year:"+ca.year);	
}


void showAll()
{
	System.out.println("--------------------------");
	System.out.println("Here we print non statics:");
	showAll();
	showName();
	

}
static void ShowAll()
{
	System.out.println("-------------------------");
	System.out.println("Here we print statics");
	ClassAct ca = new ClassAct();
	ca.showAll();
	ca.showName();
	
	
	
	
	
	
}




}