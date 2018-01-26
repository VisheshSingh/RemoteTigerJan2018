import java.util.Scanner;

public class MovieSelect {
	static // Get customer name
	// Select Movie
	// Select number of seats
	// print everything
	Scanner sc = new Scanner(System.in);
	String name;
	int seats;

	public void getName() {
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "!\nWelcome to Regal cinemas");
		getMovie();
	}

	public void getMovie() {
		System.out.print("Which movie would you prefer watching?: ");
		getSeats();
	}

	public void getSeats() {
		System.out.print("How many tickets: ");
		seats = sc.nextInt();
	}

	public static void main(String[] args) {
		MovieSelect ms = new MovieSelect();
		ms.getName();

	}

}
