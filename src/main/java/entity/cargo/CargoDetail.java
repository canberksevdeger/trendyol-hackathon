package entity.cargo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CargoDetail {
    @JsonProperty("cargoName")
    private String cargoName;

	@JsonProperty("cargoStatus")
	private String cargoStatus;

	@JsonProperty("cargoDate")
	private String cargoDate;

	@JsonProperty("cargoHour")
	private String cargoHour;

	public void setCargoName(String cargoName){
	    this.cargoName = cargoName;
    }

    public String getCargoName(){
	    return this.cargoName;
    }

	public void setCargoStatus(String cargoStatus){
		this.cargoStatus = cargoStatus;
	}

	public String getCargoStatus(){
		return cargoStatus;
	}

	public void setCargoDate(String cargoDate){
		this.cargoDate = cargoDate;
	}

	public void setCargoHour(String cargoHour){
		this.cargoHour = cargoHour;
	}

	public String getCargoDate(){
		return cargoDate;
	}

	public String getCargoHour(){
		return cargoHour;
	}

	@Override
 	public String toString(){
		return 
			"CargoDetail{" +
			"cargoStatus = '" + cargoStatus + '\'' + 
			",cargoDate = '" + cargoDate + '\'' +
			",cargoHour = '" + cargoHour + '\'' +
			"}";
		}
}