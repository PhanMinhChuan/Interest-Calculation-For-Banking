package pon.server.banking.ShinhanModel;

public class ShinhanMinMax {
    public double MinLS;
    public double MinPrimeLS;
    public double MaxLS;
    public double MinRental;
    public double MinRentalPrime;
    public double MaxRental;

    public ShinhanMinMax() {
        super();
    }

    public ShinhanMinMax(double MinLS, double MinPrimeLS, double MaxLS, double MinRental,
                         double MinRentalPrime, double MaxRental) {
        this.MinLS = MinLS;
        this.MaxLS = MaxLS;
        this.MinPrimeLS = MinPrimeLS;
        this.MinRental = MinRental;
        this.MinRentalPrime = MinRentalPrime;
        this.MaxRental = MaxRental;
    }
}
