import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class BuildThermostat {
	
	public static void main(String[] args) throws Exception{
		  
		//Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	        //Address | Address your four objects which lets your program know where to find them.
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);
	        
	        //Open | Connect your program to your physical devices.
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);
	        temperatureSensor.open(1000);
	        
	    	//temp that user sets. default temp is 21C
	        int SetTemp = 21;
	        
	        int counter = 0;
	        
	        while (true) {
	        	
	        	//green button increases set temp, red button decreases
	        if (greenButton.getState()) {
        		SetTemp++;
        		Thread.sleep(150);
        	}
	        
	        if (redButton.getState()) {
        		SetTemp--;
        		Thread.sleep(150);
        	}
	        
	        //current temperature variable
	        double CurrentTemp = temperatureSensor.getTemperature();
	        
	        
	        // if the absolute values of the current temp and set temp are less than or equal to 2, green led will turn on. 
	        //else red led will turn on.
	        if (Math.abs(CurrentTemp - SetTemp) <= 2) {
	        	 redLED.setState(false);
		         greenLED.setState(true); 
	        }
	        
	        else {
	        	 redLED.setState(true);
		         greenLED.setState(false);
	        }
	        
	        counter++;
	        if (counter>+100) { 
	        	  // print the set temp and current temp every 10 seconds.
		        System.out.println("Temperature: " + CurrentTemp + " °C" + " Set temperature: "+ SetTemp + " °C");
	            Thread.sleep(10000);
	            counter = 0;
	        }
	        Thread.sleep(100);
	        }
	}
}
