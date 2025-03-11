import java.util.HashMap;
import java.util.Map;

public class ManageID {
    private static Map<Integer, Integer> ids = new HashMap<>();

    public static String CreateID(int year) {
        int yearCount = 1;

        if (ids.containsKey(year))
            yearCount = ids.get(year) + 1;

        ids.put(year, yearCount);
        return String.valueOf(year) + String.valueOf(yearCount);
    }

}
