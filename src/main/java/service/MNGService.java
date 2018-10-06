package service;

import entity.cargo.CargoDetail;
import repository.MNGRepository;

import java.io.IOException;

public class MNGService {

    public CargoDetail getLastCargoActions(String cargoId) throws IOException {
        return new MNGRepository(cargoId).getLastCargoActions();
    }
}
