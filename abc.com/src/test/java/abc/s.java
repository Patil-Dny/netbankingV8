package abc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class s {

	
		  @Test
		  public void startCar() {
			  System.out.println("car started");
			  
			  Assert.fail();
		  }
		  
		  @Test(dependsOnMethods = {"startCar"})
		  public void driveCar() {
			  System.out.println("car driving ");
		  }
		  
		  @Test(dependsOnMethods = {"driveCar"})
		  public void stopCar() {
			  System.out.println("car stopped ");
		  }
		  
		  @Test(dependsOnMethods = {"driveCar","startCar"})
		  public void parkCar() {
			  System.out.println("car parked ");
		  }

}
