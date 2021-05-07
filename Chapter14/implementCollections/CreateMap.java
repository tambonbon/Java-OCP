package Chapter14.implementCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class CreateMap {
    public static void main(String[] args) {
        Map<String, String> map1 = Map.ofEntries(
            Map.entry("key1", "value1")
        );

        Map<String, String> map2 = new HashMap<>();
        map2.put("koala", "bamboo");
        map2.put("koala2", "bamboo");
        map2.put("koala3", "bamboo");
        System.out.println( map2.getOrDefault(2, "defaultValue"));
        System.out.println( map2.getOrDefault("koala2", "defaultValue"));

        // Behaviour of merge
        BiFunction<String, String, String> mapper = (v1, v2) 
            -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> fav = new HashMap<>();
        fav.put("Jenny", "Bus Tour");
        fav.put("Tom", "Train");
        fav.put("Sam", null);

        String jenny = fav.merge("Jenny", "Skyride", mapper);
        String tom   = fav.merge("Tom", "Skyride", mapper);
        String sam   = fav.merge("Sam", "Skyride", mapper); // when value is null 
                                                            // ---> use new value instead
                                                            // && mapper NOT called
                                                            // (it would be NPExc instead)
        System.out.println(fav);
            // {Tom=Skyride, Jenny=Bus Tour, Sam=Skyride}
        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;

        Map<String, String> fav2 = new HashMap<>();
        fav.put("Jenny", "Bus Tour");
        fav.put("Tom", "Train");
        fav2.merge("Jenny", "Skyride", mapper2);
        fav2.merge("Tom", "Skyride", mapper2);

        System.out.println(fav2); // the key is removed from the map when mapper is mapping to null
        // {Tom=Skyride, Jenny=Skyride}  

    }
}
