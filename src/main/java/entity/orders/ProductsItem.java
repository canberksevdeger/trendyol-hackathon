package entity.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ProductsItem{

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("price")
	private int price;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("contentId")
	private int contentId;

	@JsonProperty("zoomedImageUrl")
	private String zoomedImageUrl;

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setContentId(int contentId){
		this.contentId = contentId;
	}

	public int getContentId(){
		return contentId;
	}

	public void setZoomedImageUrl(String zoomedImageUrl){
		this.zoomedImageUrl = zoomedImageUrl;
	}

	public String getZoomedImageUrl(){
		return zoomedImageUrl;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"quantity = '" + quantity + '\'' + 
			",price = '" + price + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",contentId = '" + contentId + '\'' + 
			",zoomedImageUrl = '" + zoomedImageUrl + '\'' + 
			"}";
		}
}