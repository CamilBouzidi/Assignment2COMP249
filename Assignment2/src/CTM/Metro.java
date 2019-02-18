package CTM;

public class Metro extends CityBus {
	private int numVehicles;
	private String cityName;
	
	public Metro() {
		super();
	}

	public Metro(double ticketP, int nStops, long routeNum, int beginOpYear, String lineName, int numVehicles, String cityName) {
		super(ticketP, nStops, routeNum, beginOpYear, lineName);
		this.numVehicles=numVehicles;
		this.cityName=cityName;
	}

	public Metro(Metro m1) {
		super(m1);
		this.numVehicles = m1.numVehicles;
		this.cityName = m1.cityName;
	}
	
	public int getNumVehicles() {
		return numVehicles;
	}

	public void setNumVehicles(int numVehicles) {
		this.numVehicles = numVehicles;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String toString() {
		return super.toString() + "It has "+" vehicles, and operates in "+cityName+".";
	}
	
	public boolean equals(Object x) {
		if ( (this.getClass()!= x.getClass())||(x==null))//x==null is important to make sure the object being compared to isn't null.
			return false;//There is no point in checking if the object calling the method is null, because we would get a runtime error if it were.
		else {
			Metro y = (Metro) x;
			return (this.getTicketP()==y.getTicketP()&&(this.getnStops()==y.getnStops())&&(this.getRouteNum()==y.getRouteNum())&&
					(this.getLineName()==y.getLineName())&&(this.getNumVehicles()==y.getNumVehicles())&&(this.cityName==y.cityName)&&
					(this.getBeginOpYear()==y.getBeginOpYear()));
		}
	}
	
	public Metro clone() {
		return new Metro(this);
	}
}
