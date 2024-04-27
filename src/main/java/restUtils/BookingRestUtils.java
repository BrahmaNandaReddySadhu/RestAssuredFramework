package restUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class BookingRestUtils {

    public static Response post(String endPoint, Map<String, Object> payload, Map<String, Object> headers) {
                Response response=  RestAssured.
                given()
                .log()
                .all()
                .baseUri(endPoint)
                .headers(headers)
                .body(payload)
                .when()
                .post()
                .then()
                .log()
                .all()
                .extract()
                .response();
                return response;
    }

}
