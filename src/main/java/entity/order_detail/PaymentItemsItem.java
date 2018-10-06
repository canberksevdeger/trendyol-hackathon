package entity.order_detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PaymentItemsItem{

	@JsonProperty("price")
	private String price;

	@JsonProperty("name")
	private String name;

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"PaymentItemsItem{" + 
			"price = '" + price + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}