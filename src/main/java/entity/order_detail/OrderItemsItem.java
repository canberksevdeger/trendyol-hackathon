package entity.order_detail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import entity.cargo.CargoDetail;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class OrderItemsItem{

	@JsonProperty("supplierName")
	private String supplierName;

	@JsonProperty("cancelable")
	private boolean cancelable;

	@JsonProperty("showCargoDetail")
    private boolean showCargoDetail;

	@JsonProperty("cargoUrl")
	private String cargoUrl;

	@JsonProperty("cargoDetail")
	private CargoDetail cargoDetail;

	@JsonProperty("products")
	private List<ProductsItem> products;

	@JsonProperty("bankReferenceNumber")
	private String bankReferenceNumber;

	@JsonProperty("deliveryNumberPrefix")
	private String deliveryNumberPrefix;

	@JsonProperty("deliveryMessageBoldField")
	private String deliveryMessageBoldField;

	@JsonProperty("claimable")
	private boolean claimable;

	@JsonProperty("cargoCompany")
	private String cargoCompany;

	@JsonProperty("deliveryMessage")
	private String deliveryMessage;

	@JsonProperty("id")
	private int id;

	@JsonProperty("deliveryDate")
	private String deliveryDate;

	@JsonProperty("supplierDescription")
	private String supplierDescription;

	@JsonProperty("cargoClaimCode")
	private String cargoClaimCode;

	@JsonProperty("deliveryNumber")
	private String deliveryNumber;

	@JsonProperty("status")
	private String status;

	@JsonProperty("supplierOfficialName")
	private String supplierOfficialName;

	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}

	public String getSupplierName(){
		return supplierName;
	}

	public void setCancelable(boolean cancelable){
		this.cancelable = cancelable;
	}

	public boolean isCancelable(){
		return cancelable;
	}

	public void setShowCargoDetail(boolean showCargoDetail){
	    this.showCargoDetail = showCargoDetail;
    }

    public boolean getShowCargoDetail(){
	    return showCargoDetail;
    }

	public void setCargoUrl(String cargoUrl){
		this.cargoUrl = cargoUrl;
	}

	public String getCargoUrl(){
		return cargoUrl;
	}

	public void setCargoDetail(CargoDetail cargoDetail){
	    this.cargoDetail = cargoDetail;
	}

	public CargoDetail getCargoDetail(){
	    return cargoDetail;
    }

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	public void setBankReferenceNumber(String bankReferenceNumber){
		this.bankReferenceNumber = bankReferenceNumber;
	}

	public String getBankReferenceNumber(){
		return bankReferenceNumber;
	}

	public void setDeliveryNumberPrefix(String deliveryNumberPrefix){
		this.deliveryNumberPrefix = deliveryNumberPrefix;
	}

	public String getDeliveryNumberPrefix(){
		return deliveryNumberPrefix;
	}

	public void setDeliveryMessageBoldField(String deliveryMessageBoldField){
		this.deliveryMessageBoldField = deliveryMessageBoldField;
	}

	public String getDeliveryMessageBoldField(){
		return deliveryMessageBoldField;
	}

	public void setClaimable(boolean claimable){
		this.claimable = claimable;
	}

	public boolean isClaimable(){
		return claimable;
	}

	public void setCargoCompany(String cargoCompany){
		this.cargoCompany = cargoCompany;
	}

	public String getCargoCompany(){
		return cargoCompany;
	}

	public void setDeliveryMessage(String deliveryMessage){
		this.deliveryMessage = deliveryMessage;
	}

	public String getDeliveryMessage(){
		return deliveryMessage;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDeliveryDate(String deliveryDate){
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryDate(){
		return deliveryDate;
	}

	public void setSupplierDescription(String supplierDescription){
		this.supplierDescription = supplierDescription;
	}

	public String getSupplierDescription(){
		return supplierDescription;
	}

	public void setCargoClaimCode(String cargoClaimCode){
		this.cargoClaimCode = cargoClaimCode;
	}

	public String getCargoClaimCode(){
		return cargoClaimCode;
	}

	public void setDeliveryNumber(String deliveryNumber){
		this.deliveryNumber = deliveryNumber;
	}

	public String getDeliveryNumber(){
		return deliveryNumber;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setSupplierOfficialName(String supplierOfficialName){
		this.supplierOfficialName = supplierOfficialName;
	}

	public String getSupplierOfficialName(){
		return supplierOfficialName;
	}

	@Override
 	public String toString(){
		return 
			"OrderItemsItem{" + 
			"supplierName = '" + supplierName + '\'' + 
			",cancelable = '" + cancelable + '\'' +
            ",showCargoDetail = '" + showCargoDetail + '\'' +
			",cargoUrl = '" + cargoUrl + '\'' +
            ",cargoDetail = '" + cargoDetail + '\'' +
			",products = '" + products + '\'' + 
			",bankReferenceNumber = '" + bankReferenceNumber + '\'' + 
			",deliveryNumberPrefix = '" + deliveryNumberPrefix + '\'' + 
			",deliveryMessageBoldField = '" + deliveryMessageBoldField + '\'' + 
			",claimable = '" + claimable + '\'' + 
			",cargoCompany = '" + cargoCompany + '\'' + 
			",deliveryMessage = '" + deliveryMessage + '\'' + 
			",id = '" + id + '\'' + 
			",deliveryDate = '" + deliveryDate + '\'' + 
			",supplierDescription = '" + supplierDescription + '\'' + 
			",cargoClaimCode = '" + cargoClaimCode + '\'' + 
			",deliveryNumber = '" + deliveryNumber + '\'' + 
			",status = '" + status + '\'' + 
			",supplierOfficialName = '" + supplierOfficialName + '\'' + 
			"}";
		}
}