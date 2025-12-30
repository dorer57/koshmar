package Charity;

import java.util.*;
import java.util.stream.Collectors;

public class DonationPool {
    private final List<Donation> donations = new ArrayList<>();

    public void addDonation(Donation d) {
        donations.add(d);
    }

    public List<Donation> filterByCharity(String charityName) {
        return donations.stream()
                .filter(d -> d.getCharity().getName().equalsIgnoreCase(charityName))
                .collect(Collectors.toList());
    }

    public List<Donation> searchByDonor(String donorName) {
        return donations.stream()
                .filter(d -> d.getDonor().getName().equalsIgnoreCase(donorName))
                .collect(Collectors.toList());
    }
    public List<Donation> sortByAmount() {
        return donations.stream()
                .sorted(Comparator.comparingDouble(d ->
                        d.getMoney() != null ? d.getMoney() :
                                d.getMl() != null ? d.getMl() : 0.0))
                .collect(Collectors.toList());
    }
    public void printAll() {
        donations.forEach(System.out::println);
    }
}
