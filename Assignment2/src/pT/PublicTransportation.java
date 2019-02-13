package pT;

public class PublicTransportation {
	protected double ticketP;
	protected int nStops;
	
	
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

	public String toString() {
		String objFull = this.getClass().toString();
		String obj=null;
		if (objFull.charAt(6)=='.') {//Object has class PublicTransportation
			obj = objFull.substring(6);
		}
		else {//Object has class from CTM package
			obj = objFull.substring(10);
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

}
