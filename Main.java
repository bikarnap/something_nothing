/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * 
 */

public class Main {
  public static void main(String[] args) {
      // Initialize and run the program
      Library library = new Library();
      Book book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
      Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
        "Graham B & McKay J", "1911");
      Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
      library.addBook(book1);
      library.addBook(book2);
      library.addBook(book3);
      System.out.println(library.getNumberOfBooks());
      // try {
      //     library.addBook(book1);
      //     library.addBook(book2);
      //     library.addBook(book3);
      // } catch (BookAlreadyExistsException e) {
      //     System.out.println("Error: " + e.getMessage());
      // } catch (InvalidBookException e) {
      //     System.out.println("Error: " + e.getMessage());
      // }
      // Member member1 = new Member("John", "Doe");
      // Member member2 = new Member("Jane", "Doe");
      // try {
      //     library.borrowBook(book1, member1);
      //     library.borrowBook(book2, member1);
      //     library.borrowBook(book3, member2);
      // } catch (BookNotFoundException e) {
      //     System.out.println("Error: " + e.getMessage());
      // } catch (BookNotAvailableException e) {
      //     System.out.println("Error: " + e.getMessage());
      // }
      // library.returnBook(book1, member1);
  }
}
