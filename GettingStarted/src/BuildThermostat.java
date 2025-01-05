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
	        
	      //current temperature variable
	        double CurrentTemp = temperatureSensor.getTemperature();
	  
	        while (true) {
	        	// 100 iterations, each with 100ms delay = 10 seconds 
	        	for (int i = 0; i <100; i++) {
	        	
	        	//green button increases set temp, red button decreases
	        if (greenButton.getState()) {
        		SetTemp++;
        		 System.out.println("The Set temperature increased to: "+ SetTemp + " °C");
        		 while (greenButton.getState()) {
	                    Thread.sleep(10);
	                } 
        	}
	       
	        if (redButton.getState()) {
        		SetTemp--;
        		System.out.println("The Set temperature decreased to: "+ SetTemp + " °C");
        		while (redButton.getState()) {
                    Thread.sleep(10);
                }
        	}

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
                Thread.sleep(100); //100ms delay for each iteration of the for loop.
	        	}
	        
	     // print the set temp and current temp every 10 seconds.
        	System.out.println("Current Temperature: " + CurrentTemp + " °C");
        	System.out.println("The Set temperature is: "+ SetTemp + " °C");
        	
	        }  
	}
}
