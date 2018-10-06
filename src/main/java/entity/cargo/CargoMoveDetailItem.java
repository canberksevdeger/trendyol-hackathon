package entity.cargo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CargoMoveDetailItem{

	@JsonProperty("destinationUnit")
	private String destinationUnit;

	@JsonProperty("cargoStatus")
	private String cargoStatus;

	@JsonProperty("operationUnit")
	private String operationUnit;

	@JsonProperty("cargoTransaction")
	private String cargoTransaction;

	@JsonProperty("plate")
	private String plate;

	@JsonProperty("transactionDescription")
	private String transactionDescription;

	@JsonProperty("ttiBarcode")
	private String ttiBarcode;

	@JsonProperty("transactionDate")
	private String transactionDate;

	@JsonProperty("shipmentType")
	private String shipmentType;

	public void setDestinationUnit(String destinationUnit){
		this.destinationUnit = destinationUnit;
	}

	public String getDestinationUnit(){
		return destinationUnit;
	}

	public void setCargoStatus(String cargoStatus){
		this.cargoStatus = cargoStatus;
	}

	public String getCargoStatus(){
		return cargoStatus;
	}

	public void setOperationUnit(String operationUnit){
		this.operationUnit = operationUnit;
	}

	public String getOperationUnit(){
		return operationUnit;
	}

	public void setCargoTransaction(String cargoTransaction){
		this.cargoTransaction = cargoTransaction;
	}

	public String getCargoTransaction(){
		return cargoTransaction;
	}

	public void setPlate(String plate){
		this.plate = plate;
	}

	public String getPlate(){
		return plate;
	}

	public void setTransactionDescription(String transactionDescription){
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionDescription(){
		return transactionDescription;
	}

	public void setTtiBarcode(String ttiBarcode){
		this.ttiBarcode = ttiBarcode;
	}

	public String getTtiBarcode(){
		return ttiBarcode;
	}

	public void setTransactionDate(String transactionDate){
		this.transactionDate = transactionDate;
	}

	public String getTransactionDate(){
		return transactionDate;
	}

	public void setShipmentType(String shipmentType){
		this.shipmentType = shipmentType;
	}

	public String getShipmentType(){
		return shipmentType;
	}

	@Override
 	public String toString(){
		return 
			"CargoMoveDetailItem{" + 
			"destinationUnit = '" + destinationUnit + '\'' + 
			",cargoStatus = '" + cargoStatus + '\'' + 
			",operationUnit = '" + operationUnit + '\'' + 
			",cargoTransaction = '" + cargoTransaction + '\'' + 
			",plate = '" + plate + '\'' + 
			",transactionDescription = '" + transactionDescription + '\'' + 
			",ttiBarcode = '" + ttiBarcode + '\'' + 
			",transactionDate = '" + transactionDate + '\'' + 
			",shipmentType = '" + shipmentType + '\'' + 
			"}";
		}
}