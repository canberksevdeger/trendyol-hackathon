package entity.cargo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ArasCargoDetail{

	@JsonProperty("code")
	private String code;

	@JsonProperty("size")
	private String size;

	@JsonProperty("cargoMoveDetails")
	private CargoMoveDetails cargoMoveDetails;

	@JsonProperty("message")
	private String message;

	@JsonProperty("trackingNumber")
	private String trackingNumber;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setCargoMoveDetails(CargoMoveDetails cargoMoveDetails){
		this.cargoMoveDetails = cargoMoveDetails;
	}

	public CargoMoveDetails getCargoMoveDetails(){
		return cargoMoveDetails;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setTrackingNumber(String trackingNumber){
		this.trackingNumber = trackingNumber;
	}

	public String getTrackingNumber(){
		return trackingNumber;
	}

	@Override
 	public String toString(){
		return 
			"ArasCargoDetail{" + 
			"code = '" + code + '\'' + 
			",size = '" + size + '\'' + 
			",cargoMoveDetails = '" + cargoMoveDetails + '\'' + 
			",message = '" + message + '\'' + 
			",trackingNumber = '" + trackingNumber + '\'' + 
			"}";
		}
}