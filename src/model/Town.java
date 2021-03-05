package model;

public class Town {
    private String name;
    private String status;
    private int population;
    private int foundationYear;

    public Town(String name, String status, int population, int foundationYear) {
        this.name = name;
        this.status = status;
        this.population = population;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", population=" + population +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
