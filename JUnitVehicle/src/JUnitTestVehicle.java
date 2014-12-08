import static org.junit.Assert.*;

import org.junit.Test;

import Midterm1.Car;
import Midterm1.MotorCycle;
import Midterm1.Person;
import Midterm1.Truck;



public class JUnitTestVehicle {

	@Test
	public void test() {
	
	
	Person a = new Person();
   	 a.setFirstName("a");
   	 Car NewCar= new Car();
   	 NewCar.setOwner(a);
   	 NewCar.setNumberOfDoors(4);
   	 assertEquals("The first name of the Person a","a",a.getFirstName());

  	
   	 Truck NewTruck= new Truck();
   	 NewTruck.setOwner(a);
   	 NewTruck.setNumberOfAxels(2);
   	 assertEquals("This brand new truck is owned by person a", "a",NewTruck.getOwner().getFirstName());
   	 Person b= new Person();
   	 b.setFirstName("b");
   	 NewTruck.setOwner(b);
   	 assertEquals("This brand new truck is owned by person b", "b",NewTruck.getOwner().getFirstName());


   	 
   	 
   	 MotorCycle NewMotorcycle= new MotorCycle();
   	 NewMotorcycle.setHasSideCar(false);
   
   	 
  	assertEquals("The car owned by Person a has 4 doors", 4, NewCar.getNumberOfDoors());
  	assertEquals("The truch owned by Person a has 2 axels",2, NewTruck.getNumberOfAxels());
 	assertEquals("Motorcycle without a sidecar", false, NewMotorcycle.isHasSideCar());

	}

}