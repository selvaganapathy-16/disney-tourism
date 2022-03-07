import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		String name = sc.next();
		System.out.println("Enter the City name");
		String city = sc.next();
		System.out.println("Enter the phone number");
		String phone = sc.next();
		System.out.println("Enter number of people");
		int n = sc.nextInt();
		System.out.println("Enter the option");
		System.out.println("1. Boat House Booking");
		System.out.println("2. Boat Ride Booking");
		int option = sc.nextInt();
		if(option == 1)
		{
			System.out.println("Enter number of days");
			int nd = sc.nextInt();
			System.out.println("Enter food type (Veg/NonVeg)");
			String food = sc.next();
			BoatHouseBooking s = new BoatHouseBooking(name,city,phone,n,nd,food);
			double amount =s.calculateTotalAmount();
			System.out.printf("Your booking has been confirmed pay Rs.%.1f",amount);
		}
		else if(option == 2)
		{
			System.out.println("Enter number of hours");
			float na = sc.nextFloat();
			System.out.println("Do you want guide (Yes/No)");
			String guide = sc.next();
			BoatRideBooking r = new BoatRideBooking(name,city,phone,n,na,guide);
			double amount = r.calculateTotalAmount();
			System.out.printf("Your booking has been confirmed pay Rs.%.1f",amount);
		}
		sc.close();
	}

}
