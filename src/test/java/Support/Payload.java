package Support;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Payload {

    public static String createAirlineByString(long randomId){
        return "{\n" +
                "  \"id\": "+randomId+",\n" +
                "  \"name\": \"Quatar Airways\",\n" +
                "  \"country\": \"Quatar\",\n" +
                "  \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png\",\n" +
                "  \"slogan\": \"Going Places Together\",\n" +
                "  \"head_quaters\": \"Qatar Airways Towers, Doha, Qatar\",\n" +
                "  \"website\": \"www.qatarairways.com\",\n" +
                "  \"established\": \"1994\"\n" +
                "}";
    }

    public static Map<String, Object> createAirlineByMap(Object randomId){

        Map<String, Object> map = new HashMap<>();
        map.put("id", randomId);
        map.put("name", "Quatar Airway");
        map.put("country", "Quatar");
        map.put("logo", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png");
        map.put("slogan", "Going Places Together");
        map.put("head_quaters", "Qatar Airways Towers, Doha, Qatar");
        map.put("website", "www.qatarairways.com");
        map.put("established", 1994);
        return map;
    }
}
