package fERRY;

import pT.PublicTransportation;

/**
 * This is the Ferry class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class Ferry extends PublicTransportation {
	protected int buildYear;
	protected String shipName;
	
	/**
	 * Constructor
	 * Default constructor, will call the default constructor of super
	 * @return Ferry object
	 */
	public Ferry(){
		super();
		buildYear=0;
		shipName=null;
	}

	/**
	 * Constructor
	 * Parametrised constructor, will call the parametrised constructor of super
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the Ferry has.
	 * @param buildYear: when the Ferry was built
	 * @param shipName: The name of the line the Ferry is on
	 * @return Ferry object
	 */
	public Ferry(double ticketP, int nStops, int buildYear, String shipName) {
		super(ticketP, nStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}

	/**
	 * Copy constructor
	 * @param Ferry object
	 * @return identical Ferry object
	 */
	public Ferry(Ferry f1) {
		super(f1);
		this.buildYear = f1.buildYear;
		this.shipName = f1.shipName;
	}
	
	/**
	 * toString method to output the attributes of the Ferry
	 * @return String describing the attributes of the Ferry
	 */
	public String toString() {
		return super.toString()+"It was built in "+this.buildYear+", and its name is "+this.shipName+". ";
	}
	
	/**
	 * Equals method to verify if two Ferry objects have the same attributes
	 * @param Object : it is compared to the Ferry object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Ferry y = (Ferry) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops)&&(this.buildYear==y.buildYear)
					&&(this.shipName==y.shipName));
		}
	}
	
	/**
	 * Clone
	 * @return identical Ferry object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public Ferry clone() {
		return new Ferry(this);
	}
}