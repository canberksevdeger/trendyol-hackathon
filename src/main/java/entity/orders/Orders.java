package entity.orders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Orders{

	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("orders")
	private List<OrdersItem> orders;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setOrders(List<OrdersItem> orders){
		this.orders = orders;
	}

	public List<OrdersItem> getOrders(){
		return orders;
	}

	@Override
 	public String toString(){
		return 
			"Orders{" + 
			"pagination = '" + pagination + '\'' + 
			",orders = '" + orders + '\'' + 
			"}";
		}
}