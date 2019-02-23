package dRIVER;
import CTM.*;
import aIRCRAFT.*;
import aIRCRAFT.Aircraft.CType;
import aIRCRAFT.Aircraft.MType;
import aIRCRAFT.AircraftP.CTypeP;
import aIRCRAFT.AircraftP.MTypeP;
import fERRY.*;
import pT.*;

/**
 * This is the second Driver class created for Assignment 2.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

/*
 * Now that all the classes' attributes have private rights, all the subclasses must be modified to use getters when they need to access attributes from
 * super. Hence, the equals methods of all subclasses had to be modified for when they get the attributes from super.
 * The less restrictive the rights to the classes' attributes are, the easier it is to work with them. However, this makes the
 * objects more fragile, since anyone can change them.
 * Concerning the copying, some City Bus objects were copied wrong, since the copy constructor was used, hence all objects
 * that were instances of subclasses of CityBus were not copied correctly.
 */

public class Driver2 {
	public static PublicTransportationP[] copyCityBus(PublicTransportationP[] pt) {
		int buses = 0;
		
		//Looking to see how many CityBuses there are
		for (int i = 0; i < pt.length; i++) {
			if (pt[i] instanceof CityBusP) {
				buses++;
			}
		}
		
		PublicTransportationP[] result = new PublicTransportationP[buses];
	
		int spot = 0;
		//Looking to see how many CityBuses there are
		for (int i = 0; i < pt.length; i++) {
			if (pt[i] instanceof CityBusP) {
				//Telling the compiler that pt[i] is a CityBus
				result[spot++] = new CityBusP((CityBusP)(pt[i]));
			}
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
		
		
		
		//Section dedicated to part 2
		PublicTransportationP[] b1 = createVehicleArrayP(12);
		PublicTransportationP[] b2 = copyCityBus(b1);
		System.out.println("\nHere are two arrays, we will copy all the CityBuses of the first array into the second one.\n");
		System.out.println("Here's the first array: \n");
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println("\nHere's the second array: \n");
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
	
	public static PublicTransportationP[] createVehicleArrayP(int size) {
		PublicTransportationP[] a = new PublicTransportationP[size];
		int rem=0;
		for (int i = 0; i < a.length; i++) {
			rem = i%6;
			switch (rem) {
			case 1:
				a[i] = new PublicTransportationP((1.00*i),(2*i-1));
				break;
			case 2:
				a[i] = new CityBusP((2.50*i),(i+1), (151*i), (1990+i), "Road"+(60+i));
				break;
			case 3:
				a[i] = new MetroP((2.75*i),(2*i+1), (321*i), (1995+i), "Road"+(68+i), (3*i), "Gotham");
				break;
			case 4:
				a[i] = new TramP((2.50*i),(i+1), (151*i), (1990+i), "Road"+(60+i),(30+3*i));
				break;
			case 5:
				a[i] = new FerryP((24.0*i), (i-2), (1950+i), "Callister "+i);
				break;
			case 0:
				a[i] = new AircraftP((500*i), (2*i), CTypeP.Airline, MTypeP.Monthly);
			default:
			}
		}
		return a;
	}

}
