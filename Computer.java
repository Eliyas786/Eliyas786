

class Computer
{

String company = "HP";
String modelN = "EMB21";
int Ram = 4;
int Speaker = 2;
boolean wifiAndBluetooth  = true;

void showPcInfo ()
{
	System.out.println("PC company:"+company);
	System.out.println("PC model number:"+modelN);
	System.out.println("Ram capacity in GB:"+Ram);
	System.out.println("Number of speakers:"+Speaker);
	System.out.println("Wifi and bluetooth:"+wifiAndBluetooth);
}
void TurnOnPower()
{
	System.out.println("Pc is powering on.....");
}
void OSLoadUp()
{
	System.out.println("Welcome to Microsoft Windows 11..");
}
void EnterCredentials()
{
	System.out.println("Enter your password:");
	System.out.println("You successfuly logged in..");	
}
void DesktopScreenLoaded()
{
	System.out.println("Hi welcome to your desktop!!");
}

void TurnOff()
{
	System.out.println("Click on shut down button");
	
}






}