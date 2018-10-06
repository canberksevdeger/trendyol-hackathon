package repository;

import entity.cargo.CargoDetail;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MNGRepository {

    String cargoId;

    public MNGRepository(String cargoId){
        this.cargoId = cargoId;
    }

    public Document getCargoURLPage() throws IOException {
        Document doc = Jsoup.connect("http://service.mngkargo.com.tr/iactive/popup/KargoTakip/link1.asp?k=" + cargoId).get();
        return doc;
    }

    public CargoDetail getLastCargoActions() throws IOException {
        CargoDetail cargoDetail = new CargoDetail();
        Document document = getCargoURLPage();
        Element table = document.select("table").get(0);
        Element tr = table.select("tr").get(1);
        Elements tds = tr.select("td");

        cargoDetail.setCargoName("MNG Kargo");
        cargoDetail.setCargoStatus(tds.get(0).text());
        cargoDetail.setCargoDate(tds.get(1).text().split(" ")[0]);
        String cargoHour = tds.get(1).text().split(" ")[1];
        cargoDetail.setCargoHour(cargoHour.substring(0, cargoHour.length()-3));

        return cargoDetail;
    }
}