package entity.order_detail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PaymentInfo{

	@JsonProperty("paymentItems")
	private List<PaymentItemsItem> paymentItems;

	@JsonProperty("cardImageUrl")
	private String cardImageUrl;

	@JsonProperty("paymentDescription")
	private String paymentDescription;

	public void setPaymentItems(List<PaymentItemsItem> paymentItems){
		this.paymentItems = paymentItems;
	}

	public List<PaymentItemsItem> getPaymentItems(){
		return paymentItems;
	}

	public void setCardImageUrl(String cardImageUrl){
		this.cardImageUrl = cardImageUrl;
	}

	public String getCardImageUrl(){
		return cardImageUrl;
	}

	public void setPaymentDescription(String paymentDescription){
		this.paymentDescription = paymentDescription;
	}

	public String getPaymentDescription(){
		return paymentDescription;
	}

	@Override
 	public String toString(){
		return 
			"PaymentInfo{" + 
			"paymentItems = '" + paymentItems + '\'' + 
			",cardImageUrl = '" + cardImageUrl + '\'' + 
			",paymentDescription = '" + paymentDescription + '\'' + 
			"}";
		}
}