package Charity;

public class Donation {
    private static int id_gen = 0;
    private int blood_id;
    private double ml;
    private Donor donor;
    private Charity charity;

    public Donation() {
        blood_id = id_gen++;
    }

    public Donation(double amount, Donor donor, Charity charity) {
        this();
        setMl(amount);
        setDonor(donor);
        setCharity(charity);
    }

    public int getBlood_id() {
        return blood_id;
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        if (ml > 0) {
            this.ml = ml;
        }
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public static void main(String[] args) {

        Donor d1 = new Donor("Ivan Ivanych");
        Charity c1 = new Charity("Red Cross", "Health");

        Donation donation1 = new Donation(450, d1, c1);

        System.out.println("Donation ID: " + donation1.getBlood_id());
        System.out.println("Amount (ml): " + donation1.getMl());
        System.out.println("Donor: " + donation1.getDonor().getName());
        System.out.println("Charity: " + donation1.getCharity().getName());
    }
}