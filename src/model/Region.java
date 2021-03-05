package model;

import java.util.ArrayList;

public class Region {
    private String name;
    private ArrayList<District> districts;

    public Region(String name, ArrayList<District> districts) {
        this.name = name;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", districts=" + districts +
                '}';
    }
}
