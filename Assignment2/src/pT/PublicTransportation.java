package pT;

//---------------------------------------------------------
//Assignment #2
//CityBus class with its attributes made private.
//Written by: Bouzidi, Camil (ID #40099611) and Morin-Laberge, William (ID #40097269)
//---------------------------------------------------------

/**
 * This is the Public Transportation class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class PublicTransportation {
	private double ticketP;
	private int nStops;
	
	/**
	 * Constructor that will be called for all objects in this assignment.
	 * Default constructor
	 * @return Public Transportation object
	 */
	public PublicTransportation() {
		ticketP = 0.0;
		nStops = 0;
	}

	/**
	 * Constructor that will be called for all objects in this assignment.
	 * 
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the Public Transportation has.
	 * @return Public Transportation object
	 */
	public PublicTransportation(double ticketP, int nStops) {
		this.ticketP = ticketP;
		this.nStops = nStops;
	}
	
	/**
	 * Copy constructor.
	 * 
	 * @param Public Transportation object
	 * @return identical Public Transportation object
	 */
	public PublicTransportation(PublicTransportation p1) {
		this.ticketP = p1.ticketP;
		this.nStops = p1.nStops;
	}
	
	/**
	 * Accessor for the ticketP attribute. 
	 * @return double ticketP
	 */
	public double getTicketP() {
		return ticketP;
	}

	/**
	 * Mutator for the ticketP attribute.
	 * @param double ticketP
	 * @return void
	 */
	public void setTicketP(double ticketP) {
		this.ticketP = ticketP;
	}

	/**
	 * Accessor for the nStops attribute. 
	 * @return int nStops
	 */
	public int getnStops() {
		return nStops;
	}

	/**
	 * Mutator for the nStops attribute.
	 * @param int nStop
	 * @return void
	 */
	public void setnStops(int nStops) {
		this.nStops = nStops;
	}

	/**
	 * toString method to output the attributes of the Public Transportation
	 * @return String describing the attributes of the Public Transportation
	 */
	public String toString() {
		String objFull = this.getClass().toString();
		String obj=null;
		if (objFull.charAt(8)=='.') {//Object has class from package pT
			obj = objFull.substring(9);
		}
		else if (objFull.charAt(9)=='.') {//Object has class from package CTM
			obj = objFull.substring(10);
		}
		else if (objFull.charAt(11)=='.') {//Object has class from package fERRY
			obj = objFull.substring(12);
		}
		else if (objFull.charAt(14)=='.') {//Object has class from package aIRCRAFT
			obj = objFull.substring(15);
		}
		return "This "+obj+" has a ticket price of " + ticketP + "$, and has " + nStops + " stops. ";
	}
	
	/**
	 * Equals method to verify if two Public Transportation objects have the same attributes
	 * @param Object : it is compared to the Public Transportation object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			PublicTransportation y = (PublicTransportation) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops));
		}
	}
	
	/**
	 * Clone 
	 * 
	 * @param void
	 * @return identical Public Transportation object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public PublicTransportation clone() {
		return new PublicTransportation(this);
	}

}
