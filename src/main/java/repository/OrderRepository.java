package repository;

import com.jayway.restassured.response.Response;
import entity.order_detail.*;
import entity.orders.*;
import util.ApiClient;

public class OrderRepository {

    ApiClient apiClient;

    public OrderRepository(String userToken){
         apiClient= new ApiClient(userToken);
    }

    public Orders getOrderList(){
        Response getOrderList = apiClient.contentType
                .get("https://api.trendyol.com/zeus/orders?page=1")
                .thenReturn();
        System.out.println("Get Order List: " + getOrderList.getStatusCode());

        return getOrderList.as(Orders.class);
    }

    public OrderDetail getOrderDetailById(String orderId){
        Response getOrderDetail = apiClient.contentType
                .get("https://api.trendyol.com/zeus/orders/" + orderId)
                .thenReturn();
        System.out.println("Get Order Detail: " + getOrderDetail.getStatusCode());

        return getOrderDetail.as(OrderDetail.class);
    }
}