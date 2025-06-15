import java.util.ArrayList;
import java.util.List;

public class FindBuildingsWithS {
    public static List<String> findBuildingsWithS(String[] buildings) {
        List<String> result = new ArrayList<>();
        for (String building : buildings) {
            if (building.toLowerCase().startsWith("s")) {
                result.add(building);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] buildings = {"Sky Tower", "Empire State", "Sunset Plaza", "Central Park"};
        List<String> result = findBuildingsWithS(buildings);
        System.out.println("Buildings starting with S: " + result);
    }
}