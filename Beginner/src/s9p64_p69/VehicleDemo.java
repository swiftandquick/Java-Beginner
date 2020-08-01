package s9p64_p69;

public class VehicleDemo {

	public static void main(String args[]) {
		
		Vehicle unknown = new Vehicle("E500", 4, 4, "Nitropack", "Lance 2");
		unknown.type();
		System.out.println(unknown);
		
		/** Polymorphism.  */
		Vehicle bike = new Bike("Bob-2", 2, 2, "Motor 3", "Kin-V", "Sweet Handles");
		bike.type();
		System.out.println(bike);
		
		Vehicle car = new Car("Quad-2", 4, 4, "Godwin Fuel Tank", "Ra", 
				"Westfield", "DVD Plus", "S2 Leather", "WH-3", "Ink-II", "Jux Box");
		car.type();
		System.out.println(car);
		
		Vehicle truck = new Truck("18-Wheeler", 18, 2, "Hanson Fuel Tank", "Io", 
				"Westfield", "DVD Plus", "S2 Leather", "WH-3", "Breezy Trailer");
		truck.type();
		System.out.println(truck);
		
	}
	
}
