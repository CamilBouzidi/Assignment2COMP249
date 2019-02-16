package dRIVER;

import pT.PublicTransportation;
import CTM.*;
import fERRY.*;
import aIRCRAFT.*;
import aIRCRAFT.Aircraft.CType;
import aIRCRAFT.Aircraft.MType;


public class Driver {
	public static void main(String[] args) {
		PublicTransportation publicTransportation1 = new PublicTransportation(10.0,5);
		System.out.println("publicTransportation1: "+publicTransportation1);
		CityBus cityBus1 = new CityBus(20.0, 3, 192083, 1990, "Birdlane");
		System.out.println("cityBus1: "+cityBus1);
		Metro metro1 = new Metro(2.75, 15, 65065, 1991, "Orange");
		System.out.println("metro: "+metro1);
		Tram tram1 = new Tram(3.05, 5, 630036, 1991, "Kingslane", 50);
		System.out.println("tram1: "+tram1);
		Ferry ferry1 = new Ferry(3.50, 12, 1992, "SS Enterprise");
		System.out.println("ferry1: "+ferry1);
		Aircraft aircrafts1 = new Aircraft(400.0, 2, CType.Helicopter, MType.Yearly);
	}
}
