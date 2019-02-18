package dRIVER;
import CTM.CityBus;
import CTM.Metro;
import CTM.Tram;
import aIRCRAFT.Aircraft;
import aIRCRAFT.Aircraft.CType;
import aIRCRAFT.Aircraft.MType;
import fERRY.Ferry;
import pT.PublicTransportation;

/*
 * Now that pT's attributes have private rights, all the subclasses must be modified to use getters when they need to access attributes from
 * super. Hence, the equals methods of all subclasses had to be modified for when they get the attributes from super.
 * 
 * Concerning the copying, 
 */

public class Driver2 {
	public static PublicTransportation[] copyCityBus(PublicTransportation[] pt) {
		PublicTransportation[] result = new PublicTransportation[pt.length];
		for (int i = 0; i < pt.length; i++) {
			result[i] = new PublicTransportation(pt[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		PublicTransportation publicTransportation1 = new PublicTransportation(10.0,5);
		System.out.println("publicTransportation1: "+publicTransportation1);
		CityBus cityBus1 = new CityBus(20.0, 3, 192083, 1990, "Birdlane");
		System.out.println("cityBus1: "+cityBus1);
		Metro metro1 = new Metro(2.75, 15, 65065, 1991, "Orange", 20, "Montreal");
		System.out.println("metro1: "+metro1);
		Tram tram1 = new Tram(3.05, 5, 630036, 1991, "Kingslane", 50);
		System.out.println("tram1: "+tram1);
		Ferry ferry1 = new Ferry(3.50, 12, 1992, "SS Enterprise");
		System.out.println("ferry1: "+ferry1);
		Aircraft aircraft1 = new Aircraft(400.0, 2, CType.Helicopter, MType.Yearly);
		System.out.println("aircraft1: "+aircraft1);
		System.out.println("cityBus1 and metro1 are equal: "+cityBus1.equals(metro1));
		System.out.println("aircraft1 and aircraf1 are equal: "+aircraft1.equals(aircraft1));

		PublicTransportation[] a = createVehicleArray(15);
		a[0] = new PublicTransportation(publicTransportation1);

		

		PublicTransportation cheapest = new PublicTransportation();
		PublicTransportation highest = new PublicTransportation();
		double cheapestP=1000000.00;
		double highestP=0.0;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println("The price of object "+i+" is: "+a[i].getTicketP());
			if (a[i].getTicketP()<cheapestP) {
				cheapest = a[i].clone();
				cheapestP = a[i].getTicketP();
			}else if(a[i].getTicketP()>highestP) {
				highest = a[i].clone();
				highestP = a[i].getTicketP();
			}
		}
		System.out.println();
		System.out.println("The cheapest is the following: "+cheapest.toString());
		System.out.println("The most expensive is the following: "+highest.toString());
		
		PublicTransportation[] b1 = createVehicleArray(12);
		PublicTransportation[] b2 = copyCityBus(b1);
		System.out.println("Here are two arrays, they should be identical.\n");
		System.out.println("Here's the first array: \n");
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println("\nHere's the second array: ");
		for (int i = 0; i < b2.length; i++) {
			System.out.println(b2[i]);
		}
		
		System.out.println("Thank you for using this program. ");
	}
	
	public static PublicTransportation[] createVehicleArray(int size) {
		PublicTransportation[] a = new PublicTransportation[size];
		int rem=0;
		for (int i = 0; i < a.length; i++) {
			rem = i%6;
			switch (rem) {
			case 1:
				a[i] = new PublicTransportation((1.00*i),(2*i-1));
				break;
			case 2:
				a[i] = new CityBus((2.50*i),(i+1), (151*i), (1990+i), "Road"+(60+i));
				break;
			case 3:
				a[i] = new Metro((2.75*i),(2*i+1), (321*i), (1995+i), "Road"+(68+i), (3*i), "Gotham");
				break;
			case 4:
				a[i] = new Tram((2.50*i),(i+1), (151*i), (1990+i), "Road"+(60+i),(30+3*i));
				break;
			case 5:
				a[i] = new Ferry((24.0*i), (i-2), (1950+i), "Callister "+i);
				break;
			case 0:
				a[i] = new Aircraft((500*i), (2*i), CType.Airline, MType.Monthly);
			default:
			}
		}
		return a;
	}

}
