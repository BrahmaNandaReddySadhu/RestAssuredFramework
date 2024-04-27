package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, String> getJsonDataAsMap(String jsonFileName) throws IOException {
        String completeJosnPath = System.getProperty("user.dir")+"/src/test/resources/" + jsonFileName;


        System.out.println("complete json path"+completeJosnPath);
        Map<String, String> data = objectMapper.readValue(new File(completeJosnPath), new TypeReference<>() {
        });
        return data;

    }
}
