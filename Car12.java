

class Car12
{

 String com = "Chevrolet";
 String model = "Camaro";
 static String clr = "Blue";
 static int seat = 4;
 boolean sandroof = false;
 
 
 void Features()
 {
	 System.out.println("Company:"+com);
	 System.out.println("Model:"+model);
	 System.out.println("Color:"+clr);
	 System.out.println("Seats:"+seat);
	 System.out.println("Sandroof:"+sandroof);
 }
 void openDoor()
 {
	 System.out.println("Touch the the car remote control");
	 System.out.println("Door opened.....");
 }

 void Start()
 {
	 System.out.println("Tap start to start engine.");
	 System.out.println("Tapped...");
	 System.out.println("Engine started..");
	 
 }
static void OnMp3()
{
	System.out.println("Mp3 ready..");
	System.out.println("Mp3 is on.....");
}
void SandroofOpen()
{
	System.out.println("Sandroof is open at full size..");
}
static void TurnOff()
{
	System.out.println("Tap Stop to turn off engine");
	System.out.println("Engine turned off..");
}
void Mp3OFF()
{
	System.out.println("MP3  is off..");
}
 void SandRoofClosed()
 {
	 System.out.println("Sandroof is completely closed..");
 }

 static void DoorsLockced()
{
	System.out.println("All doors locked..");
}
 static void AlarmActivated()
{
	System.out.println("Click alarm  to activate security alarm!");
	System.out.println("Activating alarm.....................");
	System.out.println("Alarm activated successfuly.");
}

void Print()
{
	System.out.println("-----------------------");
	Features();
	System.out.println("-----------------------");
	openDoor();
	System.out.println("-----------------------");
	Start();
	System.out.println("-----------------------");
	OnMp3();
	System.out.println("-----------------------");
	SandroofOpen();
	System.out.println("-----------------------");
	TurnOff();
	System.out.println("-----------------------");
	Mp3OFF();
	System.out.println("-----------------------");
	SandRoofClosed();
	System.out.println("-----------------------");
	DoorsLockced();
	System.out.println("-----------------------");
	AlarmActivated();
	
}



}