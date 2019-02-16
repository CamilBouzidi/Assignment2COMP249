package CTM;

import pT.PublicTransportation;

public class CityBus extends PublicTransportation{
	protected long routeNum;
	protected int beginOpYear;
	protected String lineName;

	public CityBus() {
		super();
		routeNum = 0;
		beginOpYear = 0;
		lineName = null;
	}

	public CityBus(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName) {
		super(ticketP, nStops);
		this.routeNum = routeNum;
		this.beginOpYear = beginOpYear;
		this.lineName = lineName;
	}
	
	public CityBus(CityBus b1) {
		super(b1);
		this.routeNum=b1.routeNum;
		this.beginOpYear=b1.beginOpYear;
		this.lineName=b1.lineName;
	}
	public double getTicketP() {
		return super.getTicketP();
	}

	public long getRouteNum() {
		return routeNum;
	}

	public void setRouteNum(long routeNum) {
		this.routeNum = routeNum;
	}

	public int getBeginOpYear() {
		return beginOpYear;
	}

	public void setBeginOpYear(int beginOpYear) {
		this.beginOpYear = beginOpYear;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String toString() {
		return super.toString()+"It has the route number "+routeNum+", began operation in "
				+beginOpYear+", and its line is called "+lineName+". ";
	}
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			CityBus y = (CityBus) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops)&&(this.routeNum==y.routeNum)&&
					(this.lineName==y.lineName));
		}
	}
	
	public CityBus clone() {
		return new CityBus(this);
	}

}
