package util;

import com.jayway.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

public class ApiClient {

    public RequestSpecification contentType;
    public Map<String, String> headers = new HashMap<>();

    public ApiClient(String userToken){
        this.headers.put("Content-Type","application/json");
        this.headers.put("Authorization", "bearer " + userToken);
        this.headers.put("Platform", "iphone");

        contentType = given().headers(headers);
    }
}