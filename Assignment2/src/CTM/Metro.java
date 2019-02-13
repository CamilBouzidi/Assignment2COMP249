package CTM;

public class Metro extends CityBus {
	protected int numVehicles;
	protected String cityName;
	public Metro() {
		super();
	}

	public Metro(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName) {
		super(ticketP, nStops, routeNum, beginOpYear, lineName);
	}

	public Metro(Metro m1) {
		super(m1);
		this.numVehicles = m1.numVehicles;
		this.cityName = m1.cityName;
	}
	
	public String toString() {
		return toString() + "It has "+" vehicles, and operates in "+cityName+".";
	}
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Metro y = (Metro) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops)&&(this.routeNum==y.routeNum)&&
					(this.lineName==y.lineName)&&(this.numVehicles==y.numVehicles)&&(this.cityName==y.cityName));
		}
	}

}
