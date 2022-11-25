import java.util.Enumeration;

public abstract class Statement {
  protected abstract String getHeader(Customer aCustomer);
  protected abstract String getFigure(Rental aRental);
  protected abstract String getFooter(Customer aCustomer);

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getHeader(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      // show figures for each rental
      result += getFigure(each);
    }

    // add footer lines
    result += getFooter(aCustomer);
    return result;
  }
}