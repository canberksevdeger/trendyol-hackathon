package service;

import entity.cargo.CargoDetail;
import repository.ArasRepository;

import java.io.IOException;

public class ArasService {

    public CargoDetail getLastCargoActions(String cargoId) throws IOException {
        return new ArasRepository(cargoId).getLastCargoActions();
    }
}
