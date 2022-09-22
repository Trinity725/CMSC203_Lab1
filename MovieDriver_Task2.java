import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
			String movie, rating, response;
			int soldTickets;
			// Create a movie object name M1
			Movie m1 = new Movie();
			
		do{
			//Getting title of the movie
			System.out.println("Please enter a movie title: ");
			movie= keyboard.nextLine();
			m1.setTitle(movie);
			//System.out.println(m1.getTitle());
		
			//Getting rating of the film
			System.out.println("Enter the rating of the movie: ");
			rating= keyboard.nextLine();
			m1.setRating(rating);
			//System.out.println(m1.getRating());
		
			//Getting the amount of tickets sold
			System.out.println("Enter the number of tickets sold "
				+ "for this movie");
			soldTickets=keyboard.nextInt();
			m1.setSoldTickets(soldTickets);

			System.out.println(m1);
			System.out.println("\nWould you like to enter another movie? (y or n): \n");
			
			keyboard.nextLine();
			response= keyboard.nextLine();
			
		} while (response.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye");
	}

}
