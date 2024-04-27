package bookings;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.BookingRestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BookingTestCases {
    @Test
    public void createBooking() throws IOException {
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        Map<String,String> jsonMap=JsonUtils.getJsonDataAsMap("booking/"+env+"/bookingApi.json");
        String endpoint=jsonMap.get("endpoint");
        Map<String , Object> payload  =BookingPayload.payloadAsMap("Sadhu","Brahma",222,true,"2024-10-01","2024-10-01","I need special vegetable biryanai");
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-Type","application/json");
        Response response = BookingRestUtils.post(endpoint,payload, headers);
        Assert.assertEquals(200,response.statusCode());

    }
}
