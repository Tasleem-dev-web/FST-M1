package Activity;

public class Activity{
	public static void main(String[] args) {
		Car newcar=new Car();
		newcar.make=2014;
		newcar.Color="Black";
		newcar.transmission="manual";
		newcar.accelarate();
		newcar.brake();
		newcar.displayCharacterstics();
	}
}