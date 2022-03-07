
public class BoatRideBooking extends Booking{
	private float noOfHours;
	private String guide;
	
	public BoatRideBooking(String customerName, String cityName,String phoneNumber, int noOfPeople,float  noOfHours,String guide)
	{
		super(customerName, cityName, phoneNumber, noOfPeople);
		this.noOfHours =noOfHours;
		this.guide = guide;
	}
	
	public float getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(float noOfHours) {
		this.noOfHours = noOfHours;
	}
	public String getGuide() {
		return guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}

	public double calculateTotalAmount() {
		double amount = noOfPeople*80+noOfHours*300;
		if(this.guide.toLowerCase().equals("yes"))
		{
			amount +=150;
		}
		return amount;
	}

}
