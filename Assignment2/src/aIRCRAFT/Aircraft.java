package aIRCRAFT;

import pT.PublicTransportation;

/**
 * This is the Aircraft class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class Aircraft extends PublicTransportation {
	public static enum CType{Helicopter, Airline, Glider, Balloon}
	public static enum MType{Weekly, Monthly, Yearly}
	
	protected CType CTypeChosen;
	protected MType MTypeChosen;
	
	/**
	 * Constructor
	 * Default constructor
	 * @return Aircraft object
	 */
	public Aircraft() {
		super();
		CTypeChosen = null;
		MTypeChosen = null;
		
	}

	/**
	 * Constructor
	 * Parametrised constructor
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the Aircraft has.
	 * @param CTypeChosen: specification of the type of the Aircraft
	 * @param MTypeChosen: Frequency of maintenance.
	 * @return Aircraft object
	 */
	public Aircraft(double ticketP, int nStops, CType CTypeChosen, MType MTypeChosen) {
		super(ticketP, nStops);
		this.CTypeChosen = CTypeChosen;
		this.MTypeChosen = MTypeChosen;
	}

	/**
	 * Constructor
	 * Copy constructor
	 * @param Aircraft object
	 * @return Aircraft object
	 */
	public Aircraft(Aircraft a1) {
		super(a1);
		this.CTypeChosen = a1.CTypeChosen;
		this.MTypeChosen = a1.MTypeChosen;
	}
	
	/**
	 * Accesor for CTypeChosen attribute.
	 * @return CType CTypeChosen
	 */
	public CType getCTypeChosen() {
		return CTypeChosen;
	}

	/**
	 * Mutator for CTypeChosen attribute.
	 * @param CType CTypeChosen
	 */
	public void setCTypeChosen(CType cTypeChosen) {
		CTypeChosen = cTypeChosen;
	}

	/**
	 * Accesor for MTypeChosen attribute.
	 * @return MType MTypeChosen
	 */
	public MType getMTypeChosen() {
		return MTypeChosen;
	}

	/**
	 * Accesor for MTypeChosen attribute.
	 * @param MType MTypeChosen
	 */
	public void setMTypeChosen(MType mTypeChosen) {
		MTypeChosen = mTypeChosen;
	}

	/**
	 * toString method to output the attributes of the Aircraft
	 * @return String describing the attributes of the Aircraft
	 */
	public String toString() {
		return super.toString() + "It is a "+CTypeChosen+", and must be maintained "+MTypeChosen+". ";
	}
	
	/**
	 * Equals method to verify if two Aircraft objects have the same attributes
	 * @param Object : it is compared to the Aircraft object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Aircraft y = (Aircraft) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops)&&(this.CTypeChosen==y.CTypeChosen)&&
					(this.MTypeChosen==y.MTypeChosen));
		}
	}
	
	/**
	 * Clone 
	 * @return identical Aircraft object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public Aircraft clone() {
		return new Aircraft(this);
	}
	
}
