package CTM;

public class Tram extends CityBus{
	protected int maxSpeed;

	public Tram() {
		super();
		maxSpeed=0;
	}

	public Tram(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName, int maxSpeed) {
		super(ticketP, nStops, routeNum, beginOpYear, lineName);
		this.maxSpeed = maxSpeed;
	}
	
	public Tram(Tram t1) {
		super(t1.getTicketP(), t1.getnStops(), t1.getRouteNum(), t1.getBeginOpYear(), t1.getLineName());
		this.maxSpeed = t1.maxSpeed;
	}
	
	public String toString(){
		return super.toString()+"It has a max speed of "+maxSpeed+".";
	}
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Tram y = (Tram) x;
			return ((this.ticketP==y.ticketP)&&(this.nStops==y.nStops)&&(this.routeNum==y.routeNum)&&
					(this.lineName==y.lineName)&&(this.maxSpeed==y.maxSpeed));
		}
	}
	

}
