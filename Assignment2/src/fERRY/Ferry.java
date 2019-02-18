package fERRY;

import pT.PublicTransportation;

public class Ferry extends PublicTransportation {
	private int buildYear;
	private String shipName;
	

	public Ferry(){
		super();
		buildYear=0;
		shipName=null;
	}

	public Ferry(double ticketP, int nStops, int buildYear, String shipName) {
		super(ticketP, nStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}

	public Ferry(Ferry f1) {
		super(f1);
		this.buildYear = f1.buildYear;
		this.shipName = f1.shipName;
	}
	
	public String toString() {
		return super.toString()+"It was built in "+this.buildYear+", and its name is "+this.shipName+". ";
	}
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Ferry y = (Ferry) x;
			return ((this.getTicketP()==y.getTicketP())&&(this.getnStops()==y.getnStops())&&(this.buildYear==y.buildYear)
					&&(this.shipName==y.shipName));
		}
	}
	public Ferry clone() {
		return new Ferry(this);
	}
}