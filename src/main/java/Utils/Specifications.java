package Utils;

import java.util.HashMap;
import java.util.Map;

public class Specifications {

    public static Map<String, String> HeadersConfig(){
        Map<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json");
        return map;
    }
}
