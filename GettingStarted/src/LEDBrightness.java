//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {

	 public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalOutput redLED = new DigitalOutput();

	        //Address 
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        //Open 
	        redLED.open(1000);

	        //Use your Phidgets with Duty Cycle 
	        while (true) {
	        	redLED.setDutyCycle(0.0);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.2);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.4);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.6);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.8);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(1);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.8);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.6);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.4);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0.2);
	        	Thread.sleep(150);
	        	redLED.setDutyCycle(0);
	        	Thread.sleep(150);
	        }
	    }
	
}
