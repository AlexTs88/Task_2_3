package model;

public class District {
    private String name;
    private double area;
    private Town town;

    public District(String name, double area, Town town) {
        this.name = name;
        this.area = area;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Town getTown() {
        return town;
    }

    public void setTowns(Town town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", town=" + town +
                '}';
    }
}
