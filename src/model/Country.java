package model;

import java.util.ArrayList;

public class Country {
    private String name;
    private ArrayList<Region> regions;

    public Country(String name, ArrayList<Region> regions) {
        this.name = name;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public String getCapital() {
        String capital = null;
        for (Region region : regions) {
            ArrayList<District> districts = region.getDistricts();
            for (District district : districts) {
                if (district.getTown().getStatus().equals("Capital"))
                    capital = district.getTown().getName();
            }
        }
        return capital;
    }

    public int getQuantityOfRegions() {
        return regions.size();
    }

    public double getArea() {
        double area = 0;
        for (Region region: regions) {
            ArrayList<District> districts = region.getDistricts();
            for (District district : districts) {
                area += district.getArea();
            }
        }
        return area;
    }

    public ArrayList<String> getRegionCenters() {
        ArrayList<String> regionCenters = new ArrayList<>();
        for (Region region : regions) {
            ArrayList<District> districts = region.getDistricts();
            for (District district : districts) {
                if (district.getTown().getStatus().equals("Region center") || district.getTown().getStatus().equals("Capital"))
                    regionCenters.add(district.getTown().getName());
            }
        }
        return regionCenters;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                '}';
    }
}
