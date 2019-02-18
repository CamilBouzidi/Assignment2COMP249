package pT;

public class PublicTransportation {
	private double ticketP;
	private int nStops;
	
	
	public PublicTransportation() {
		ticketP = 0.0;
		nStops = 0;
	}


	public PublicTransportation(double ticketP, int nStops) {
		this.ticketP = ticketP;
		this.nStops = nStops;
	}
	
	public PublicTransportation(PublicTransportation p1) {
		this.ticketP = p1.ticketP;
		this.nStops = p1.nStops;
	}

	public double getTicketP() {
		return ticketP;
	}


	public void setTicketP(double ticketP) {
		this.ticketP = ticketP;
	}


	public int getnStops() {
		return nStops;
	}


	public void setnStops(int nStops) {
		this.nStops = nStops;
	}


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
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			PublicTransportation y = (PublicTransportation) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops));
		}
	}
	
	public PublicTransportation clone() {
		return new PublicTransportation(this);
	}

}
