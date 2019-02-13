package dRIVER;

import pT.PublicTransportation;
import CTM.*;
import fERRY.*;
import aIRCRAFT.*;

//Hey, um, does this work?
public class Driver {
	public static void main(String[] args) {
		PublicTransportation p1 = new PublicTransportation(10.0,5);
		System.out.println("p1: "+p1);
		CityBus c1 = new CityBus(20.0, 3, 192083, 1990, "Birdlane");
		System.out.println("c1: "+c1);
		Metro m1 = new Metro(2.75, 15, 65065, 1991, "Orange");
		System.out.println("m1: "+m1);
		Tram t1 = new Tram(3.05, 5, 630036, 1991, "Kingslane", 50);
		System.out.println("t1: "+t1);
		Ferry f1 = new Ferry(3.50, 12, 1992, "SS Enterprise");
		System.out.println("f1: "+f1);
		Aircraft a1 = new Aircraft(400.0, 2, Helicopter, Yearly);
	}
}
