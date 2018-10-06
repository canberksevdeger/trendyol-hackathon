package repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import entity.cargo.ArasCargoDetail;
import entity.cargo.CargoDetail;
import entity.cargo.CargoMoveDetailItem;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

public class ArasRepository {

    public String cargoId;
    public RequestSpecification contentType;
    public Map<String, String> headers = new HashMap<>();

    public ArasRepository(String cargoId){
        this.cargoId = cargoId;
        headers.put("Referer","https://social.araskargo.com.tr/");
        headers.put("X-Requested-With","XMLHttpRequest");
        headers.put("Accept-Encoding","gzip, deflate, br");
        headers.put("Accept","application/json, text/javascript");
        headers.put("Content-Type","application/json");

        contentType = given().headers(headers);
    }

    public boolean isCargoDelivered(){
        ArasCargoDetail arasCargoDetail = new ArasCargoDetail();

        Response getLastCargoAction = contentType
                .get("https://social.araskargo.com.tr/Facebook/KargoTakipDetay?trackingNumber=" + cargoId)
                .thenReturn();
        System.out.println("Get Order List: " + getLastCargoAction.getStatusCode());
        arasCargoDetail = getLastCargoAction.as(ArasCargoDetail.class);

        return arasCargoDetail.getCargoMoveDetails().getCargoMoveDetail()
                .get(arasCargoDetail.getCargoMoveDetails().getCargoMoveDetail().size()-1)
                .getCargoStatus().toString().equals("TESLİM EDİLDİ");
    }

    public CargoDetail getLastCargoActions() throws IOException {
        ArasCargoDetail arasCargoDetail = new ArasCargoDetail();
        CargoDetail cargoDetail = new CargoDetail();

        Response getLastCargoAction = contentType
                .get("https://social.araskargo.com.tr/Facebook/KargoTakipDetay?trackingNumber=" + cargoId)
                .thenReturn();
        System.out.println("Get Order List: " + getLastCargoAction.getStatusCode());

        String response = getLastCargoAction.asString();

        ObjectMapper objectMapper = new ObjectMapper();
        response = getLastCargoAction.asString().toString();
        response = response.replace("\\\"", "\"");
        response = response.substring(1,response.length()-1);

        arasCargoDetail = objectMapper.readValue(response, ArasCargoDetail.class);

        int lastActionIndex = arasCargoDetail.getCargoMoveDetails().getCargoMoveDetail().size()-1;
        CargoMoveDetailItem cargoMoveDetailItem = arasCargoDetail.getCargoMoveDetails().getCargoMoveDetail().get(lastActionIndex);
        String date = cargoMoveDetailItem.getTransactionDate();
        String cargoDate = date.split(" ")[0];
        String cargoHour = date.split(" ")[1];
        cargoHour = cargoHour.substring(0, cargoHour.length()-5);

        cargoDetail.setCargoName("Aras Kargo");
        cargoDetail.setCargoStatus(cargoMoveDetailItem.getCargoStatus());
        cargoDetail.setCargoDate(cargoDate);
        cargoDetail.setCargoHour(cargoHour);

        return cargoDetail;
    }

}