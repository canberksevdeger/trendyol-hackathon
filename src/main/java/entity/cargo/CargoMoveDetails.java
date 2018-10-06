package entity.cargo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CargoMoveDetails{

	@JsonProperty("cargoMoveDetail")
	private List<CargoMoveDetailItem> cargoMoveDetail;

	public void setCargoMoveDetail(List<CargoMoveDetailItem> cargoMoveDetail){
		this.cargoMoveDetail = cargoMoveDetail;
	}

	public List<CargoMoveDetailItem> getCargoMoveDetail(){
		return cargoMoveDetail;
	}

	@Override
 	public String toString(){
		return 
			"CargoMoveDetails{" + 
			"cargoMoveDetail = '" + cargoMoveDetail + '\'' + 
			"}";
		}
}