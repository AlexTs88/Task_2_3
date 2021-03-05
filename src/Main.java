import model.Country;
import model.District;
import model.Region;
import model.Town;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
            3. Создать объект класса Государство, используя классы Область, Район, Город.
            Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
         */

        ArrayList<District> districtsMinskRegion = new ArrayList<>(Arrays.asList(
                new District("Minsk district", 60000, new Town("Minsk", "Capital", 2000000, 912)),
                new District("Borisov district", 55000, new Town("Borisov", "District center", 800000, 1248))
        ));

        ArrayList<District> districtsGomelRegion = new ArrayList<>(Arrays.asList(
                new District("Gomel district", 80000, new Town("Gomel", "Region center", 500000, 1088)),
                new District("Mozyr district", 70000, new Town("Mozyr", "District center", 1000000, 1340))
        ));

        ArrayList<District> districtsBrestRegion = new ArrayList<>(Arrays.asList(
                new District("Brest district", 65000, new Town("Brest", "Region center", 2000000, 1102)),
                new District("Stolin district", 75000, new Town("Stolin", "District center", 30000, 950))
        ));

        ArrayList<District> districtsGrodnoRegion = new ArrayList<>(Arrays.asList(
                new District("Grodno district", 80000, new Town("Grodno", "Region center", 3000000, 1054)),
                new District("Lida district", 75000, new Town("Lida", "District center", 1000000, 950))
        ));

        ArrayList<District> districtsVitebskRegion = new ArrayList<>(Arrays.asList(
                new District("Vitebsk district", 55000, new Town("Vitebsk", "Region center", 2500000, 992)),
                new District("Polotsk district", 50000, new Town("Polotsk", "District center", 50000, 1012))
        ));

        ArrayList<District> districtsMogilevRegion = new ArrayList<>(Arrays.asList(
                new District("Mogilev district", 75000, new Town("Mogilev", "Region center", 350000, 1128)),
                new District("Orsha district", 55000, new Town("Orsha", "District center", 100000, 1345))
        ));

        ArrayList<Region> regions = new ArrayList<>(Arrays.asList(
                new Region("Minsk region", districtsMinskRegion),
                new Region("Gomel region", districtsGomelRegion),
                new Region("Brest region", districtsBrestRegion),
                new Region("Grodno region", districtsGrodnoRegion),
                new Region("Vitebsk region", districtsVitebskRegion),
                new Region("Mogilev region", districtsMogilevRegion)
        ));

        Country country = new Country("Belarus", regions);

        System.out.println("Столица: " + country.getCapital());
        System.out.println("Количество областных центров: " + country.getQuantityOfRegions());
        System.out.println("Площадь: " + country.getArea());
        System.out.println("Список областных центров: " + country.getRegionCenters());
    }
}
