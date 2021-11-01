package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	
	private void vehicleNecessery() {
		System.out.println("vehicle necesery");

	}
 public static void main(String[] args) {
	
	 Vehicle v = new Vehicle();
	 TwoWheeler t = new TwoWheeler();
	 ThreeWheeler h  = new ThreeWheeler();
	 FourWheeler f = new FourWheeler();
	 
	 v.vehicleNecessery();
	 t.Bike();
	 t.Cycle();
	 h.auto();
	 f.car();
	 f.bus();
	 f.lorry();
}
}
