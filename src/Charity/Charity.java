package Charity;

public class Charity extends Entity {
    private String category;

    public Charity(String name, String category) {
        super(name);
        this.category = category;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return super.toString() + ", category='" + category + "'";
    }
}
