package entity.order_detail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class OrderItems {

    @JsonProperty("orderItems")
    private List<OrderItemsItem> orderItems;

    public List<OrderItemsItem> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(List<OrderItemsItem> orderdetails) {
        this.orderItems = orderdetails;
    }

    @Override
    public String toString(){
        return
                "OrderItems{" +
                        "orderItems = '" + orderItems + '\'' +
                        "}";
    }
}
