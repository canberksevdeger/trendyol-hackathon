package repository;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import entity.cargo.CargoDetail;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

public class YurticiRepository {
    public String cargoId;
    public RequestSpecification contentType;
    public Map<String, String> headers = new HashMap<>();

    public YurticiRepository(String cargoId){
        this.cargoId = cargoId;
        this.headers.put("X-AjaxPro-Method","GetCargoHistory");
        this.headers.put("Origin", "http://selfservis.yurticikargo.com");
        this.headers.put("Content-Type", "application/json");
        this.headers.put("Referer", "http://selfservis.yurticikargo.com/reports/SSWDocumentDetail.aspx?DocId=" + cargoId);

        contentType = given().headers(headers);
    }

    public boolean isCargoDelivered() throws IOException {
        Document document = Jsoup.connect("http://selfservis.yurticikargo.com/reports/SSWDocumentDetail.aspx?DocId=" + cargoId).get();
        return document.select("table")
                .get(2).select("tr")
                .get(0).select("td")
                .get(1).text().equals("TESLİM EDİLDİ");
    }

    public CargoDetail getLastCargoActions() throws IOException {
        CargoDetail cargoDetail = new CargoDetail();

        Response getLastCargoAction = contentType
                .body("{\"docId\":\"" + cargoId + "\"}")
                .post("http://selfservis.yurticikargo.com/ajaxpro/SelfService.Web.reports.SSWDocumentDetail,SelfService.Web.ashx")
                .thenReturn();
        System.out.println("Get Order List: " + getLastCargoAction.getStatusCode());

        Document document = Jsoup.parse(getLastCargoAction.asString());
        Element table = document.select("table").get(0);
        Elements trs = table.select("tr");
        Elements tds = trs.get(trs.size()-1).select("td");

        cargoDetail.setCargoName("Yurtiçi Kargo");
        cargoDetail.setCargoDate(tds.get(1).text());
        cargoDetail.setCargoHour(tds.get(2).text());
        cargoDetail.setCargoStatus(tds.get(3).text());

        return cargoDetail;
    }
}
