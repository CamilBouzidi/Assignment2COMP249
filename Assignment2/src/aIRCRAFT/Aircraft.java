package aIRCRAFT;

import pT.PublicTransportation;

public class Aircraft extends PublicTransportation {
	enum CType{Helicopter, Airline, Glider, Balloon}
	enum MType{Weekly, Monthly, Yearly}
	
	protected CType CTypeChosen;
	protected MType MTypeChosen;
	
	public Aircraft() {
		super();
		CTypeChosen = null;
		MTypeChosen = null;
		
	}

	public Aircraft(double ticketP, int nStops, CType CTypeChosen, MType MTypeChosen) {
		super(ticketP, nStops);
		this.CTypeChosen = CTypeChosen;
		this.MTypeChosen = MTypeChosen;
	}

	public Aircraft(Aircraft a1) {
		super(a1);
		this.CTypeChosen = a1.CTypeChosen;
		this.MTypeChosen = a1.MTypeChosen;
	}
	
	public String toString() {
		return super.toString() + "It is a "+CTypeChosen+", and must be maintained"+MTypeChosen+". ";
	}
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Aircraft y = (Aircraft) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops)&&(this.CTypeChosen==y.CTypeChosen)&&
					(this.MTypeChosen==y.MTypeChosen));
		}
	}
	
	
}
