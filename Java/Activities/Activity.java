package Activity;

public class Activity {
	
	
	

	    public static void main(String[] args) {
	    	Car Newcar=new Car();
	    	Newcar.make = 2014;
	    	Newcar.color = "Black";
	    	Newcar.transmission = "Manual";
	    
	        //Using Car class method
	    	Newcar.displayCharacterstics();
	    	Newcar.accelerate();
	    	Newcar.brake();
	    }

	}


