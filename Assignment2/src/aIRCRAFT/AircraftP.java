package aIRCRAFT;

import pT.PublicTransportationP;

/**
 * This is the AircraftP class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class AircraftP extends PublicTransportationP {
	public static enum CTypeP{Helicopter, Airline, Glider, Balloon}
	public static enum MTypeP{Weekly, Monthly, Yearly}
	
	private CTypeP CTypeChosen;
	private MTypeP MTypeChosen;
	
	/**
	 * Constructor
	 * Default constructor
	 * @return AircraftP object
	 */
	public AircraftP() {
		super();
		CTypeChosen = null;
		MTypeChosen = null;
		
	}

	/**
	 * Constructor
	 * Parametrised constructor
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the AircraftP has.
	 * @param CTypeChosen: specification of the type of the AircraftP
	 * @param MTypeChosen: Frequency of maintenance.
	 * @return AircraftP object
	 */
	public AircraftP(double ticketP, int nStops, CTypeP CTypeChosen, MTypeP MTypeChosen) {
		super(ticketP, nStops);
		this.CTypeChosen = CTypeChosen;
		this.MTypeChosen = MTypeChosen;
	}

	/**
	 * Constructor
	 * Copy constructor
	 * @param AircraftP object
	 * @return AircraftP object
	 */
	public AircraftP(AircraftP a1) {
		super(a1);
		this.CTypeChosen = a1.CTypeChosen;
		this.MTypeChosen = a1.MTypeChosen;
	}
	
	/**
	 * Accesor for CTypeChosen attribute.
	 * @return CType CTypeChosen
	 */
	public CTypeP getCTypeChosen() {
		return CTypeChosen;
	}

	/**
	 * Mutator for CTypeChosen attribute.
	 * @param CType CTypeChosen
	 */
	public void setCTypeChosen(CTypeP cTypeChosen) {
		CTypeChosen = cTypeChosen;
	}

	/**
	 * Accesor for MTypeChosen attribute.
	 * @return MType MTypeChosen
	 */
	public MTypeP getMTypeChosen() {
		return MTypeChosen;
	}

	/**
	 * Accesor for MTypeChosen attribute.
	 * @param MType MTypeChosen
	 */
	public void setMTypeChosen(MTypeP mTypeChosen) {
		MTypeChosen = mTypeChosen;
	}

	/**
	 * toString method to output the attributes of the AircraftP
	 * @return String describing the attributes of the AircraftP
	 */
	public String toString() {
		return super.toString() + "It is a "+CTypeChosen+", and must be maintained "+MTypeChosen+". ";
	}
	
	/**
	 * Equals method to verify if two AircraftP objects have the same attributes
	 * @param Object : it is compared to the AircraftP object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			AircraftP y = (AircraftP) x;
			return ((this.getTicketP()==y.getTicketP())&&(this.getnStops()==y.getnStops())&&(this.CTypeChosen==y.CTypeChosen)&&
					(this.MTypeChosen==y.MTypeChosen));
		}
	}
	
	/**
	 * Clone 
	 * @return identical AircraftP object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public AircraftP clone() {
		return new AircraftP(this);
	}
	
}
