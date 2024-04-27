package bookings;

import java.util.HashMap;
import java.util.Map;

public class BookingPayload {

    /*
     "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
     */
    public static Map<String, Object> payloadAsMap(String firstName, String lastName, int totalPrice , boolean depositPaid , String checkinDate, String checkoutDate , String additionalneeds){
        HashMap<String, String> bookingdates = new HashMap<>();
        Map< String , Object> payload = new HashMap<>();
        payload.put("firstname",firstName);
        payload.put("lastname",lastName);
        payload.put("totalprice",totalPrice);
        payload.put("depositpaid",depositPaid);
        bookingdates.put("checkin",checkinDate);
        bookingdates.put("checkout",checkoutDate);
        payload.put("bookingdates",bookingdates);
        payload.put("additionalneeds",additionalneeds);
        return payload;
    }

    }

