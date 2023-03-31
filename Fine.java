import java.util.Date;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 * 
 */
public class Fine {
  /**
   * Declares an int field for fine id.
   */
  private int fineId;
  /**
   * Declares a User field for user.
   */
  private User user;
  /**
   * Declares a double field for fine amount.
   */
  private double fineAmount;
  /**
   * Declares a Date field for fine date.
   */
  private Date fineDate;
  /**
   * Declares a String field for fine status.
   * <p> Possible values: paid, unpaid
   */
  private String fineStatus;
  
  /**
   * Constructs a Fine object.
   * @param fineId the fine id -> int
   * @param user the User -> User
   * @param fineAmount the fine amount -> double
   * @param fineDate the fine date -> Date
   * @param fineStatus the fine status -> String
   */
  public Fine(int fineId, User user, double fineAmount, Date fineDate, String fineStatus) {
    this.fineId = fineId;
    this.user = user;
    this.fineAmount = fineAmount;
    this.fineDate = fineDate;
    this.fineStatus = fineStatus;
  }
  
  /**
   * Sets the user of the fine.
   * <p> Takes a User object as argument.
   * @param user the user -> User
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Sets the fine date.
   * <p> Takes a Date object as argument.
   * @param fineDate the fine date -> Date
   */
  public void setFineDate(Date fineDate) {
    this.fineDate = fineDate;
  }

  /**
   * Sets the fine status.
   * <p> Takes a String as argument.
   * @param fineStatus the fine status -> String (paid | unpaid)
   */
  public void setFineStatus(String fineStatus) {
    this.fineStatus = fineStatus;
  }

  /**
   * Sets the fine amount.
   * <p> Takes a double value as argument.
   * @param fineAmount the fine amount -> double
   */
  public void setFineAmount(double fineAmount) {
    this.fineAmount = fineAmount;
  }

  /**
   * Gets the fine id.
   * @return the fine id -> int
   */
  public int getFineId() {
    return fineId;
  }

  /**
   * Gets the User of the fine.
   * @return the user -> User
   */
  public User getUser() {
    return user;
  }

  /**
   * Gets the fine amount.
   * @return the fine amount -> double
   */
  public double getFineAmount() {
    return fineAmount;
  }

  /**
   * Gets the fine date.
   * @return the fine date -> Date
   */
  public Date getFineDate() {
    return fineDate;
  }

  /**
   * Gets the fine status.
   * @return the fine status -> String (paid | unpaid)
   */
  public String getFineStatus() {
    return fineStatus;
  }
  
}
