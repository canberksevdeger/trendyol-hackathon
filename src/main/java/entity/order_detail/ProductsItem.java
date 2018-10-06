package entity.order_detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ProductsItem{

	@JsonProperty("brandName")
	private String brandName;

	@JsonProperty("marketPrice")
	private int marketPrice;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("salePrice")
	private int salePrice;

	@JsonProperty("campaignId")
	private int campaignId;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("contentId")
	private int contentId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("variantName")
	private String variantName;

	@JsonProperty("zoomedImageUrl")
	private String zoomedImageUrl;

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setMarketPrice(int marketPrice){
		this.marketPrice = marketPrice;
	}

	public int getMarketPrice(){
		return marketPrice;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setSalePrice(int salePrice){
		this.salePrice = salePrice;
	}

	public int getSalePrice(){
		return salePrice;
	}

	public void setCampaignId(int campaignId){
		this.campaignId = campaignId;
	}

	public int getCampaignId(){
		return campaignId;
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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setVariantName(String variantName){
		this.variantName = variantName;
	}

	public String getVariantName(){
		return variantName;
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
			"brandName = '" + brandName + '\'' + 
			",marketPrice = '" + marketPrice + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",salePrice = '" + salePrice + '\'' + 
			",campaignId = '" + campaignId + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",contentId = '" + contentId + '\'' + 
			",name = '" + name + '\'' + 
			",variantName = '" + variantName + '\'' + 
			",zoomedImageUrl = '" + zoomedImageUrl + '\'' + 
			"}";
		}
}