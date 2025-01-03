import com.phidget22.*;

public class HotOrCold {
	
	 public static void main(String[] args) throws Exception{
		 
		//Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	      //Create | Create objects for your buttons and LEDs
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();
	        
	        //Address | Address 2 objects which lets your program know where to find them.
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);
	        
	      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
	        temperatureSensor.open(1000);
	        redLED.open(1000);
	        greenLED.open(1000);
	        
while (true) {
	
			System.out.println(" Temperature: " + temperatureSensor.getTemperature() + " °C");
			Thread.sleep(350);
			
	        //Use your Phidgets | This code will print the temperature every 150ms
	        if (20 > temperatureSensor.getTemperature() || 24 < temperatureSensor.getTemperature() ) {
	        	  redLED.setState(true);
	        	  greenLED.setState(false);
	        }
	        
	        else {
	        	greenLED.setState(true);
	        	redLED.setState(false);
	        }
	        
}
	 }
}
