import java.util.Date;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * @since 17.0
 */

public class Main {
  public static void main(String[] args) {
    // Initialize and run the program
    User user1 = new User("Bikarna Pokharel", "0466151364", 1);
    User user2 = new User("Timo Pitkanen", "0466123164", 2);
    User user3 = new User("Reshma Mahat", "0445413649", 3);

    System.out.println("User information");
    System.out.println("User 1 name: " + user1.getName() );
    System.out.println("User 2 name: " + user2.getName() );
    System.out.println("User 2 name: " + user2.getName() );
    System.out.println();

    Admin admin = new Admin(user1);
    System.out.println("Admin information:");
    System.out.println(admin.getAdmin());
    System.out.println();

    Library library = new Library();
    
    Book book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");

    System.out.println("Book information:");
    System.out.println("Book 1 name: " + book1.getTitle());
    System.out.println("Book 2 name: " + book2.getTitle());
    System.out.println("Book 3 name: " + book3.getTitle());
    System.out.println();

    try {
      library.addBook(book1);
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
      return;
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
      return;
    }

    library.addUser(user3);
    admin.addUser(user2);
    library.removeBook(book3);

    System.out.println("Library information:");
    System.out.println("Number of books: " + library.getNumberOfBooks());
    System.out.println("Library contains book3? " + library.getAllBooks().contains(book3));
    System.out.println();

    Reservation reservation = new Reservation(user3, book3, new Date());
    ReservationList reservationList = new ReservationList();
    reservationList.addReservation(reservation);

    System.out.println("Reservation and ReservationList related info:");
    System.out.println("Rservation made by: " + reservation.getUser().getName());
    System.out.println();

    Search search = new Search(library);
    search.searchBook(book3);
    System.out.println("Search:");
    System.out.println("Search: " + search.getSearch() );
    System.out.println();

    Fine fine = new Fine(1, user3, 2.45, new Date(), "unpaid");
    System.out.println("Fine information:");
    System.out.println("Fine amount: " + fine.getFineAmount() + " for user " + fine.getUser().getName());
    System.out.println();

    Calculator calculator = new Calculator();
    System.out.println("Calculations:");
    System.out.println("2 + 2 = " + calculator.add(2, 2));
    System.out.println("23 - 2 = " + calculator.subtract(23, 2));
    System.out.println("2 * 2 = " + calculator.multiply(2, 2));
    System.out.println("10 / 5 = " + calculator.divide(10, 5));
    System.out.println("2 ^ 2 = " + calculator.power(2, 2));
    System.out.println();

    StringManipulator stringManipulator = new StringManipulator();
    System.out.println("Capitalize first letter of hamcrest: " + stringManipulator.capitalizeFirstLetter("hamcrest"));
    System.out.println("Trim the word '   my life': " + stringManipulator.trimString("   my life"));
    System.out.println("String 'my name is ken' contains string 'ken': " +stringManipulator.containsSubstring("my name is ken!", "ken"));
    System.out.println("Reverse of 'hello': " + stringManipulator.reverseString("hello"));
    System.out.println("Number of times the letter 'l' occurse in 'buffalo': " + stringManipulator.countOccurrences("buffalo", 'l'));
    System.out.println();
    System.out.println("End");
    System.out.println();
  }
}
