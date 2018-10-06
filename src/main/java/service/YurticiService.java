package service;

import entity.cargo.CargoDetail;
import repository.YurticiRepository;

import java.io.IOException;

public class YurticiService {

    public CargoDetail getLastCargoActions(String cargoId) throws IOException {
        return new YurticiRepository(cargoId).getLastCargoActions();
    }
}
