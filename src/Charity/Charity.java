package Charity;

public class Charity {
    private static int id_gen = 0;
    private int fund;
    private String name;

    public Charity() {
        fund = id_gen++;
    }

    public Charity(String name, String category) {
        this();
        setName(name);
    }

    public int getFund() {
        return fund;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Charity c1 = new Charity("Red Cross", "Health");
        System.out.println("Charity ID: " + c1.getFund() + ", Name: " + c1.getName());
    }
}