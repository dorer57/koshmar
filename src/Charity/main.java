package Charity;

public class main {
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
