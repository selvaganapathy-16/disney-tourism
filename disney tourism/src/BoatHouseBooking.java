
public class BoatHouseBooking extends Booking {

	private int noOfDays;
	private String foodType;

	
	public BoatHouseBooking(String customerName, String cityName,String phoneNumber, int noOfPeople,int  noOfDays,String foodType)
	{
		super(customerName, cityName, phoneNumber, noOfPeople);
		this.noOfDays =noOfDays;
		this.foodType = foodType;
	}
	
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double calculateTotalAmount() {
		double amount =noOfPeople*800+noOfDays*3000;
		
		if(this.foodType.toLowerCase().equals("nonveg"))
		{
			amount= amount + 500;
		}
		else if(this.foodType.toLowerCase().equals("veg"))
		{
			amount= amount +250;
		}
		
		return amount;
	}
	
	
}
