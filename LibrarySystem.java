import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
  private boolean loggedIn;
  private String username;
  private String password;

  public LibrarySystem() {
    this.loggedIn = false;
  }

  public void start() {
    displayWelcomeScreen();
    login();
    displayMenu();
    logout();
    displayExitMessage();
  }

  private void displayWelcomeScreen() {
    System.out.println("Welcome to the Lirary system!");
  }

  private void displayExitMessage() {
    System.out.println("Thank you for using the Library system service. See you again!");
  }

  private void login() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String username = scanner.nextLine();
    System.out.println("Please enter your password: ");
    String password = scanner.nextLine();

    if (isValidUser(username, password)) {
      System.out.println("Login successful!");
      this.loggedIn = true;
      this.username = username;
      this.password = password;
    }
  }

  private boolean isValidUser(String username, String password) {
    return true;
  }

  private void logout() {
    System.out.println("Logging out of the system...");
    this.loggedIn = false;
    this.username = null;
    this.password = null;
  }

  public void displayMenu() {
    while(loggedIn) {
      System.out.println("Please select an option:");
      System.out.println("1. Book Catalog");
      System.out.println("2. Logout");

      Scanner scanner = new Scanner(System.in);
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          displayBookCatalog();
          break;
        case 2: 
          logout();
          break;
        default:
          System.out.println("Invalid choice. Please a number corresponding to the menu.");
          break;

      }
    }
  }

  public void displayBookCatalog() {
    while(loggedIn) {
      System.out.println("Book menu");
      System.out.println("1. Add book");
      System.out.println("2. Remove book");
      System.out.println("3. Find book");
      System.out.println("4. List all books");
      System.out.println("5. Back");

      Scanner scanner = new Scanner(System.in);
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          choiceInfo(1);
          addBook();
          break;
        case 2:
          choiceInfo(2);
          removeBook();
          break;
        case 3:
          choiceInfo(3);
          findBook();
          break;
        case 4:
          choiceInfo(4);
          listBooks();
          break;
        case 5:
          choiceInfo(5)
          return;
        default:
          System.out.println("Invalid choice. Please select available choice.");
          break;

      }
    }
  }

  public void addBook() {
    System.out.println("Book added");
  }

  public void removeBook() {
    System.out.println("Book removed");
  }

  public void findBook() {
    System.out.println("Book found");
  }

  public void listBooks() {
    System.out.println("List of books");
  }

  public void choiceInfo(int choice) {
    System.out.println("You choose " + choice);
  }
}
