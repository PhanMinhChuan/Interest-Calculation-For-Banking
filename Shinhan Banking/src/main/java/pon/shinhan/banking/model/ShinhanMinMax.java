package pon.shinhan.banking.model;

public class ShinhanMinMax {
    public double MinLS;
    public double MaxLS;
    public double MinRental;
    public double MaxRental;

    public ShinhanMinMax() {
        super();
    }

    public ShinhanMinMax(double MinLS, double MaxLS, double MinRental, double MaxRental) {
        this.MinLS = MinLS;
        this.MaxLS = MaxLS;
        this.MinRental = MinRental;
        this.MaxRental = MaxRental;
    }
}
