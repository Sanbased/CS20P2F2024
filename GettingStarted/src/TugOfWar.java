import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar {
	  public static void main(String[] args) throws Exception{
		  
		//Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();
	        
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
	        
	        int redCount = 0, greenCount = 0;
	        
	        while (redCount < 10 && greenCount <10) {
	        	if (redButton.getState()) {
	        		redCount++;  
	        		Thread.sleep(150);
	        	}
	        	if (greenButton.getState()) {
	        		greenCount++;
	        		Thread.sleep(150);
	        	}
	        	
	        }
	        	
	        
	        if (redCount >= 10 || greenCount >=10) {
	        	redLED.setState(true);
	            greenLED.setState(true);
	            Thread.sleep(400);
	            redLED.setState(false);
	            greenLED.setState(false);
	            Thread.sleep(400);
	            redLED.setState(true);
	            greenLED.setState(true);
	            Thread.sleep(400);
	            redLED.setState(false);
	            greenLED.setState(false);
	            Thread.sleep(400);
	        }
	        	
	        if (redCount >= 10) {
	            for (int i = 0; i < 5; i++) {
	                redLED.setState(true);
	                Thread.sleep(300);
	                redLED.setState(false);
	                Thread.sleep(300);
	            }
	        } 
	        if (greenCount >= 10) {
	     
	            for (int i = 0; i < 5; i++) {
	                greenLED.setState(true);
	                Thread.sleep(300);
	                greenLED.setState(false);
	                Thread.sleep(300);
	            }
	        }

	  }
}
