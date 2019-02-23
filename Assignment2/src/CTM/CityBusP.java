package CTM;

import pT.PublicTransportationP;

/**
 * This is the CityBusP class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */

/**
 * This is the CityBus class created for Assignment 2.
 * Constructors, Getters, Setters and methods using the class' attributes are included.
 * @author Morin-Laberge, William (ID #40097269), and Bouzidi, Camil (ID #40099611)
 * @version 5.0
 * COMP 249 
 * Assignment #2
 * February 24 2019
 */
public class CityBusP extends PublicTransportationP{
	private long routeNum;
	private int beginOpYear;
	private String lineName;

	/**
	 * Default constructor, which will call the default constructor of super as well
	 * @return CityBusP object
	 */
	public CityBusP() {
		super();
		routeNum = 0;
		beginOpYear = 0;
		lineName = null;
	}

	/**
	 * @param ticketP: the price of a ticket.
	 * @param nStops: The number of stops the CityBusP has.
	 * @param routeNum: route number of the bus
	 * @param beginOpYear: The year since the bus has started operating
	 * @param lineName: The name of the line the bus is on
	 * @return Public Transportation object
	 */
	public CityBusP(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName) {
		super(ticketP, nStops);
		this.routeNum = routeNum;
		this.beginOpYear = beginOpYear;
		this.lineName = lineName;
	}
	
	/**
	 * Copy constructor.
	 * 
	 * @param CityBusP object
	 * @return identical CityBusP
	 */
	public CityBusP(CityBusP b1) {
		super(b1);
		this.routeNum=b1.routeNum;
		this.beginOpYear=b1.beginOpYear;
		this.lineName=b1.lineName;
	}

	/**
	 * Accessor for the routeNum attribute. 
	 * @return long routeNum
	 */
	public long getRouteNum() {
		return routeNum;
	}

	/**
	 * Mutator for the routeNum attribute. 
	 * @param long routeNum
	 */
	public void setRouteNum(long routeNum) {
		this.routeNum = routeNum;
	}
	
	/**
	 * Accessor for the beginOpYear attribute. 
	 * @return int beginOpYear
	 */
	public int getBeginOpYear() {
		return beginOpYear;
	}

	/**
	 * Mutator for the beginOpYear attribute. 
	 * @param int beginOpYear
	 */
	public void setBeginOpYear(int beginOpYear) {
		this.beginOpYear = beginOpYear;
	}

	/**
	 * Accessor for the lineName attribute. 
	 * @return String lineName
	 */
	public String getLineName() {
		return lineName;
	}

	/**
	 * Mutator for the lineName attribute. 
	 * @param String lineName
	 */
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	/**
	 * toString method to output the attributes of the CityBusP
	 * @return String describing the attributes of the CityBusP
	 */
	public String toString() {
		return super.toString()+"It has the route number "+routeNum+", began operation in "
				+beginOpYear+", and its line is called "+lineName+". ";
	}
	
	/**
	 * Equals method to verify if two CityBusP objects have the same attributes
	 * @param Object : it is compared to the Public Transportation object that calls the method
	 * @return boolean : true if the CityBusPes are identical, false if they are not.
	 * Before doing any checking, it verifies if the argument object is of the same class, and is not null.
	 */
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			CityBusP y = (CityBusP) x;
			return ((this.getTicketP()==y.getTicketP())&&(this.getnStops()==y.getnStops())&&(this.routeNum==y.routeNum)&&
					(this.lineName==y.lineName));
		}
	}
	
	/**
	 * Clone 
	 * 
	 * @param void
	 * @return identical CityBusP object
	 * This method will get overridden by subclasses, unlike the copy constructor.
	 */
	public CityBusP clone() {
		return new CityBusP(this);
	}

}
