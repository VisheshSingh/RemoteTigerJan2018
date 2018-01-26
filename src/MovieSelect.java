import java.util.Scanner;

public class MovieSelect {
	static // Get customer name
	// Select Movie
	// Select number of seats
	// print everything
	Scanner sc = new Scanner(System.in);
	String[] movieList = { "1) Avengers", "2) Star Wars", "3) Coco", "4) The Foreigner" };
	String name;
	int number;

	public void getName() {
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "!\nWelcome to Regal cinemas");
		getMovie();
	}

	public void getMovie() {
		System.out.println("Which movie would you prefer watching?: ");
		for (int i = 0; i < movieList.length; i++) {
			System.out.println(movieList[i]);
		}
		number = sc.nextInt();
		System.out.println(
				"You selected the movie " + movieList[number - 1].substring(3, movieList[number - 1].length()));
		getSeats();
	}

	public void getSeats() {
		System.out.print("How many seats: ");
		String seats = sc.next();
		System.out.println("Thank you!\nYou have selected " + seats + " seat(s) for the movie "
				+ movieList[number - 1].substring(3, movieList[number - 1].length()));
	}

	public static void main(String[] args) {
		MovieSelect ms = new MovieSelect();
		ms.getName();

	}

}
