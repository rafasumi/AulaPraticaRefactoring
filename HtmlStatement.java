public class HtmlStatement extends Statement {
  protected String getHeader(Customer aCustomer) {
     return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  protected String getFigure(Rental aRental) {
    return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
  }

  protected String getFooter(Customer aCustomer) {
    return "<P>You owe <EM>"
      + String.valueOf(aCustomer.getTotalCharge())
      + "</EM><P>\n" + "On this rental you earned <EM>" 
      + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
      + "</EM> frequent renter points<P>";
  }
}