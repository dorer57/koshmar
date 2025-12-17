package Charity;

public class Donor {
    private static int id_gen = 0;   // static id generator
    private int id;
    private String name;

    public Donor() {
        id = id_gen++;
    }

    public Donor(String name) {
        this();
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Donor d1 = new Donor("Vasya Pupkin");
        System.out.println(d1.getId() + " " + d1.getName());
    }
}
