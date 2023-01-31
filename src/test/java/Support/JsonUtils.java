package Support;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {


    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, String> getJsonDataAsMap(String environment, String jsonFileName) {
        Map<String, String> data;
        try {
            String completeJsonPath = System.getProperty("user.dir") + environment + jsonFileName;
            data = objectMapper.readValue(new File(completeJsonPath), new TypeReference<>() {
            });
        } catch (IOException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);

        }

        return data;
    }
}
