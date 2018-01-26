import java.util.Scanner;

public class MovieSelect {
	static // Get customer name
	// Select Movie
	// Select number of seats
	// print everything
	Scanner sc = new Scanner(System.in);
	String[] movieList = { "1) Avengers", "2) Star Wars", "3) Coco", "4) The Foreigner" };
	String name;

	public void getName() {
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "!\nWelcome to Regal cinemas");
		getMovie();
	}

	public void getMovie() {
		System.out.print("Which movie would you prefer watching?: ");
		int number;
		getSeats();
	}

	public void getSeats() {
		System.out.print("How many tickets: ");
		String seats;
		seats = sc.nextLine();
	}

	public static void main(String[] args) {
		MovieSelect ms = new MovieSelect();
		ms.getName();

	}

}
