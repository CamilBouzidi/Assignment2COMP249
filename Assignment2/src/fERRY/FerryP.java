package fERRY;

import pT.PublicTransportationP;

/**
 * This is the Ferry class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class FerryP extends PublicTransportationP {
	private int buildYear;
	private String shipName;
	
	/**
	 * Constructor
	 * Default constructor, will call the default constructor of super
	 * @return FerryP object
	 */
	public FerryP(){
		super();
		buildYear=0;
		shipName=null;
	}

	/**
	 * Constructor
	 * Parametrised constructor, will call the parametrised constructor of super
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the FerryP has.
	 * @param buildYear: when the FerryP was built
	 * @param shipName: The name of the line the FerryP is on
	 * @return FerryP object
	 */
	public FerryP(double ticketP, int nStops, int buildYear, String shipName) {
		super(ticketP, nStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}

	/**
	 * Copy constructor
	 * @param FerryP object
	 * @return identical FerryP object
	 */
	public FerryP(FerryP f1) {
		super(f1);
		this.buildYear = f1.buildYear;
		this.shipName = f1.shipName;
	}
	
	/**
	 * toString method to output the attributes of the FerryP
	 * @return String describing the attributes of the FerryP
	 */
	public String toString() {
		return super.toString()+"It was built in "+this.buildYear+", and its name is "+this.shipName+". ";
	}
	
	/**
	 * Equals method to verify if two FerryP objects have the same attributes
	 * @param Object : it is compared to the FerryP object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			FerryP y = (FerryP) x;
			return ((this.getTicketP()==y.getTicketP())&&(this.getnStops()==y.getnStops())&&(this.buildYear==y.buildYear)
					&&(this.shipName==y.shipName));
		}
	}
	
	/**
	 * Clone
	 * @return identical FerryP object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public FerryP clone() {
		return new FerryP(this);
	}
}