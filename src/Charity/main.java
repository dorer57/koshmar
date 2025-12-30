package Charity;

public class main {
    public static void main(String[] args) {
        Donor d1 = new Donor("Ivan Ivanych");
        Donor d2 = new Donor("Vasya Pupkin");
        Donor d3 = new Donor("Anatoliy Pirozhkov");

        Charity c1 = new Charity("Red Cross", "Health");
        Charity c2 = new Charity("GreenPeace", "Environment");
        Charity c3 = new Charity("WWF", "Environment");

        DonationPool pool = new DonationPool();
        pool.addDonation(new Donation(450, d1, c1)); // кровь
        pool.addDonation(new Donation(d2, c2, 1000)); // деньги
        pool.addDonation(new Donation(d3, c3, 2000)); // деньги

        System.out.println("=== All donations ===");
        pool.printAll();

        System.out.println("\n=== Filter by charity 'WWF' ===");
        pool.filterByCharity("WWF").forEach(System.out::println);

        System.out.println("\n=== Search by donor 'Anatoliy Pirozhkov' ===");
        pool.searchByDonor("Anatoliy Pirozhkov").forEach(System.out::println);

        System.out.println("\n=== Sorted by amount of donation (ASC) ===");
        pool.sortByAmount().forEach(System.out::println);
    }
}
