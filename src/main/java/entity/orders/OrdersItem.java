package entity.orders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class OrdersItem{

	@JsonProperty("totalPrice")
	private int totalPrice;

	@JsonProperty("orderParentId")
	private int orderParentId;

	@JsonProperty("statusGroups")
	private List<StatusGroupsItem> statusGroups;

	@JsonProperty("orderDate")
	private String orderDate;

	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

	public int getTotalPrice(){
		return totalPrice;
	}

	public void setOrderParentId(int orderParentId){
		this.orderParentId = orderParentId;
	}

	public int getOrderParentId(){
		return orderParentId;
	}

	public void setStatusGroups(List<StatusGroupsItem> statusGroups){
		this.statusGroups = statusGroups;
	}

	public List<StatusGroupsItem> getStatusGroups(){
		return statusGroups;
	}

	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}

	public String getOrderDate(){
		return orderDate;
	}

	@Override
 	public String toString(){
		return 
			"OrdersItem{" + 
			"totalPrice = '" + totalPrice + '\'' + 
			",orderParentId = '" + orderParentId + '\'' + 
			",statusGroups = '" + statusGroups + '\'' + 
			",orderDate = '" + orderDate + '\'' + 
			"}";
		}
}