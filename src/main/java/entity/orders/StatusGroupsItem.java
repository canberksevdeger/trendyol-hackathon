package entity.orders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class StatusGroupsItem{

	@JsonProperty("refundedPrice")
	private int refundedPrice;

	@JsonProperty("cargoCompany")
	private String cargoCompany;

	@JsonProperty("id")
	private int id;

	@JsonProperty("deliveryDate")
	private String deliveryDate;

	@JsonProperty("cargoClaimCode")
	private String cargoClaimCode;

	@JsonProperty("products")
	private List<ProductsItem> products;

	@JsonProperty("status")
	private String status;

	public void setRefundedPrice(int refundedPrice){
		this.refundedPrice = refundedPrice;
	}

	public int getRefundedPrice(){
		return refundedPrice;
	}

	public void setCargoCompany(String cargoCompany){
		this.cargoCompany = cargoCompany;
	}

	public String getCargoCompany(){
		return cargoCompany;
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

	public void setCargoClaimCode(String cargoClaimCode){
		this.cargoClaimCode = cargoClaimCode;
	}

	public String getCargoClaimCode(){
		return cargoClaimCode;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"StatusGroupsItem{" + 
			"refundedPrice = '" + refundedPrice + '\'' + 
			",cargoCompany = '" + cargoCompany + '\'' + 
			",id = '" + id + '\'' + 
			",deliveryDate = '" + deliveryDate + '\'' + 
			",cargoClaimCode = '" + cargoClaimCode + '\'' + 
			",products = '" + products + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}