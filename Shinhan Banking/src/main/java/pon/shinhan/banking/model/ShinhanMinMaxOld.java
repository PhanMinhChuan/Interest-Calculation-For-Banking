package pon.shinhan.banking.model;

import javax.persistence.Entity;

public class ShinhanMinMaxOld {
    public double MinLS;
    public double MinPrimeLS;
    public double MaxLS;
    public double MinRental;
    public double MinRentalPrime;
    public double MaxRental;

//    public double getMinLS() {
//        return MinLS;
//    }
//
//    public double getMaxLS() {
//        return MaxLS;
//    }
//
//    public double getMinPrimeLS() {
//        return MinPrimeLS;
//    }
//
//    public double getMinRental() {
//        return MinRental;
//    }
//
//    public double getMinRentalPrime() {
//        return MinRentalPrime;
//    }
//
//    public double getMaxRental() {
//        return MaxRental;
//    }
//
//    public void setMinPrimeLS(double MinPrimeLS) {
//        this.MinPrimeLS = MinPrimeLS;
//    }
//
//    public void setMaxLS(double MaxLS) {
//        this.MaxLS = MaxLS;
//    }
//
//    public void setMinLS(double MinLS) {
//        this.MinLS = MinLS;
//    }
//
//    public void setMaxRental(double maxRental) {
//        MaxRental = maxRental;
//    }
//
//    public void setMinRentalPrime(double minRentalPrime) {
//        MinRentalPrime = minRentalPrime;
//    }
//
//    public void setMinRental(double minRental) {
//        MinRental = minRental;
//    }

    public ShinhanMinMaxOld() {
        super();
    }

    public ShinhanMinMaxOld(double MinLS, double MinPrimeLS, double MaxLS, double MinRental,
                            double MinRentalPrime, double MaxRental) {
        this.MinLS = MinLS;
        this.MaxLS = MaxLS;
        this.MinPrimeLS = MinPrimeLS;
        this.MinRental = MinRental;
        this.MinRentalPrime = MinRentalPrime;
        this.MaxRental = MaxRental;
    }
}
