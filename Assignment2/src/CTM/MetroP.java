package CTM;

/**
 * This is the MetroP class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

public class MetroP extends CityBusP {
	private int numVehicles;
	private String cityName;
	
	/**
	 * Constructor
	 * Default constructor
	 * @return MetroP object
	 */
	public MetroP() {
		super();
	}

	/**
	 * Constructor
	 * Parametrised constructor
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the MetroP has.
	 * @param routeNum: route number of the MetroP
	 * @param beginOpYear: The year since the MetroP has started operating
	 * @param lineName: The name of the line the MetroP is on
	 * @param numVehicles: How many vehicles are attached to it
	 * @param cityName: What city it belongs to
	 * @return MetroP object
	 */
	public MetroP(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName, int numVehicles, String cityName) {
		super(ticketP, nStops, routeNum, beginOpYear, lineName);
		this.numVehicles=numVehicles;
		this.cityName=cityName;
	}

	/**
	 * Constructor
	 * Copy constructor
	 * @param MetroP object
	 * @return MetroP object
	 */
	public MetroP(MetroP m1) {
		super(m1);
		this.numVehicles = m1.numVehicles;
		this.cityName = m1.cityName;
	}
	
	/**
	 * Accesor for numVehicles attribute.
	 * @return int numVehicles
	 */
	public int getNumVehicles() {
		return numVehicles;
	}

	/**
	 * Mutator for the numVehicles attribute.
	 * @param int numVehicles
	 * @return void
	 */
	public void setNumVehicles(int numVehicles) {
		this.numVehicles = numVehicles;
	}
	
	/**
	 * Accesor for cityName attribute.
	 * @return String cityName
	 */
	public String getCityName() {
		return cityName;
	}
	
	/**
	 * Mutator for the cityName attribute.
	 * @param String cityName
	 * @return void
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	/**
	 * toString method to output the attributes of the MetroP
	 * @return String describing the attributes of the MetroP
	 */
	public String toString() {
		return super.toString() + "It has "+" vehicles, and operates in "+cityName+".";
	}
	
	/**
	 * Equals method to verify if two MetroP objects have the same attributes
	 * @param Object : it is compared to the MetroP object that calls the method
	 * @return boolean : true if the objects are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			MetroP y = (MetroP) x;
			return (this.getTicketP()==y.getTicketP()&&(this.getnStops()==y.getnStops())&&(this.getRouteNum()==y.getRouteNum())&&
					(this.getLineName()==y.getLineName())&&(this.numVehicles==y.numVehicles)&&(this.cityName==y.cityName)&&
					(this.getBeginOpYear()==y.getBeginOpYear()));
		}
	}
	
	/**
	 * Clone 
	 * @return identical MetroP object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public MetroP clone() {
		return new MetroP(this);
	}
}
