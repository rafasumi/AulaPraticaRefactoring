public class Rental {

  private Movie _movie;
  private int _daysRented;

  public Rental(Movie movie, int daysRented) {
    _movie = movie;
    _daysRented = daysRented;
  }

  public int getDaysRented() {
    return _daysRented;
  }

  public Movie getMovie() {
    return _movie;
  }

  public double getCharge() {
    return this._movie.getCharge(this._daysRented);
  }

  public int getFrequentRenterPoints() {
    return this._movie.getFrequentRenterPoints(this._daysRented);
  }
}