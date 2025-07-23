package Activity;

public class Car {
    String color;
    int make;
    String transmission;
   

    
    public void displayCharacterstics(){
	System.out.println("Color of the Car: " + color);
	System.out.println("Make of the Car: " + make);
	System.out.println("Transmission of the Car: " + transmission);
	
    }

    public void accelerate() {
	System.out.println("Car is Moving");
    }
	
    public void brake() {
	System.out.println("Car has stopped on brake.");
    }
}


