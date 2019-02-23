package CTM;

/**
 * This is the Tram class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class Tram extends CityBus{
	protected int maxSpeed;

	/**
	 * Constructor
	 * Default constructor, will call the default constructor of super
	 * @return Tram object
	 */
	public Tram() {
		super();
		maxSpeed=0;
	}

	/**
	 * Constructor
	 * Parametrised constructor
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the the Tram has.
	 * @param routeNum: route number of the Tram
	 * @param beginOpYear: The year since the bus Tram started operating
	 * @param lineName: The name of the line the Tram is on
	 * @param maxSpeed: The maximum speed the Tram can operate at.
	 * @return Tram object
	 */
	public Tram(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName, int maxSpeed) {
		super(ticketP, nStops, routeNum, beginOpYear, lineName);
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * Constructor
	 * Copy constructor
	 * @param Tram object
	 * @return Tram object
	 */
	public Tram(Tram t1) {
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
	 * toString method to output the attributes of the Tram
	 * @return String describing the attributes of the Tram
	 */
	public String toString(){
		return super.toString()+"It has a max speed of "+maxSpeed+" km/hs.";
	}
	
	/**
	 * Equals method to verify if two Tram objects have the same attributes
	 * @param Object : it is compared to the Tram object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Tram y = (Tram) x;
			return ((this.nStops==y.nStops)&&(this.ticketP==y.ticketP)&&(this.routeNum==y.routeNum)&&
					(this.lineName==y.lineName)&&(this.maxSpeed==y.maxSpeed)&&(this.beginOpYear==y.beginOpYear));
		}
	}
	
	/**
	 * Clone 
	 * @return identical Tram object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public Tram clone() {
		return new Tram(this);
	}
}
