package Charity;

import java.util.Objects;

public class Donation {
    private static int id_gen = 0;
    private final int donationId;
    private Double ml;       // для крови
    private Double money;    // для денег
    private Donor donor;
    private Charity charity;

    public Donation(double ml, Donor donor, Charity charity) {
        this.donationId = id_gen++;
        this.ml = ml;
        this.donor = donor;
        this.charity = charity;
    }

    public Donation(Donor donor, Charity charity, double money) {
        this.donationId = id_gen++;
        this.money = money;
        this.donor = donor;
        this.charity = charity;
    }

    public int getDonationId() { return donationId; }
    public Double getMl() { return ml; }
    public Double getMoney() { return money; }
    public Donor getDonor() { return donor; }
    public Charity getCharity() { return charity; }

    @Override
    public String toString() {
        if (ml != null) {
            return "Donation{" +
                    "id=" + donationId +
                    ", ml=" + ml +
                    ", donor=" + donor.getName() +
                    ", charity=" + charity.getName() +
                    '}';
        } else {
            return "Donation{" +
                    "id=" + donationId +
                    ", money=" + money +
                    ", donor=" + donor.getName() +
                    ", charity=" + charity.getName() +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donation)) return false;
        Donation donation = (Donation) o;
        return donationId == donation.donationId &&
                Objects.equals(ml, donation.ml) &&
                Objects.equals(money, donation.money) &&
                Objects.equals(donor, donation.donor) &&
                Objects.equals(charity, donation.charity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(donationId, ml, money, donor, charity);
    }
    public double getAmountValue() {
        if (money != null) return money;
        if (ml != null) return ml;
        return 0.0;
    }

}
