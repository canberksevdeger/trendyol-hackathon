package controller;

import entity.cargo.CargoDetail;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.MNGService;
import service.YurticiService;

import java.io.IOException;

@RestController
public class CargoController {

    @RequestMapping("/getMNGCargoDetail")
    public CargoDetail getMNGCargoDetail(@RequestParam(value = "cargoId", defaultValue = "1") String cargoId) throws IOException {
        return new MNGService().getLastCargoActions(cargoId);
    }

    @RequestMapping("/getYurticiCargoDetail")
    public CargoDetail getYurticiCargoDetail(@RequestParam(value = "cargoId", defaultValue = "1") String cargoId) throws IOException {
        return new YurticiService().getLastCargoActions(cargoId);
    }
}