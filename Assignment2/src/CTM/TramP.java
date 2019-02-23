package CTM;

/**
 * This is the TramP class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class TramP extends CityBusP{
	private int maxSpeed;

	/**
	 * Constructor
	 * Default constructor, will call the default constructor of super
	 * @return TramP object
	 */
	public TramP() {
		super();
		maxSpeed=0;
	}

	/**
	 * Constructor
	 * Parametrised constructor
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the the TramP has.
	 * @param routeNum: route number of the TramP
	 * @param beginOpYear: The year since the bus TramP started operating
	 * @param lineName: The name of the line the TramP is on
	 * @param maxSpeed: The maximum speed the TramP can operate at.
	 * @return TramP object
	 */
	public TramP(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName, int maxSpeed) {
		super(ticketP, nStops, routeNum, beginOpYear, lineName);
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * Constructor
	 * Copy constructor
	 * @param TramP object
	 * @return TramP object
	 */
	public TramP(TramP t1) {
		super(t1);
		this.maxSpeed = t1.maxSpeed;
	}
	
	/**
	 * Accessor for the maxSpeed attribute. 
	 * @return int maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Mutator for the maxSpeed attribute.
	 * @param int maxSpeed
	 * @return void
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * toString method to output the attributes of the TramP
	 * @return String describing the attributes of the TramP
	 */
	public String toString(){
		return super.toString()+"It has a max speed of "+maxSpeed+" km/hs.";
	}
	
	/**
	 * Equals method to verify if two TramP objects have the same attributes
	 * @param Object : it is compared to the TramP object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			TramP y = (TramP) x;
			return ((this.getnStops()==y.getnStops())&&(this.getTicketP()==y.getTicketP())&&(this.getRouteNum()==y.getRouteNum())&&
					(this.getLineName()==y.getLineName())&&(this.maxSpeed==y.maxSpeed)&&(this.getBeginOpYear()==y.getBeginOpYear()));
		}
	}
	
	/**
	 * Clone 
	 * @return identical TramP object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public TramP clone() {
		return new TramP(this);
	}
}
