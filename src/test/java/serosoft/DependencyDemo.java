package serosoft;

import org.testng.annotations.Test;

public class DependencyDemo {
	public String trackingID=null;
@Test
	public void CreateShipment() {
		System.out.println("Shipment is created...");
		trackingID="Pallavi";
		
	}
@Test(dependsOnMethods = {"CreateShipment"})
public void trackShipment() {
	if(trackingID!=null) {
		System.out.println("Shipment is track...");
	}
	else {
		System.out.println("Shipment is Null...");
	}
	
	
	

}
@Test(dependsOnMethods = {"CreateShipment","trackShipment"})
public void cancelShipment() {
	if(trackingID!=null) {
		System.out.println("Shipment is Cancelled...");
	}
	else {
		System.out.println("Shipment is Null...");
	}
	
}
}
