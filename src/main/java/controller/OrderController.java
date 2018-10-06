package controller;

import entity.order_detail.OrderDetail;
import entity.order_detail.OrderItems;
import entity.orders.Orders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.io.IOException;

@RestController
public class OrderController {

    @RequestMapping("/getOrderListByToken")
    public Orders getOrderListByToken(@RequestParam(value = "userToken", defaultValue = "null") String userToken){
        return new OrderService(userToken).getOrderList();
    }

    @RequestMapping("/getOrderDetailById")
    public OrderDetail getOrderDetailById(@RequestParam(value = "userToken", defaultValue = "null") String userToken,
                                          @RequestParam(value = "orderId", defaultValue = "1") String orderId){
        return new OrderService(userToken).getOrderDetailById(orderId);
    }

    @RequestMapping("/getOrderItems")
    public OrderItems getOrderItems(@RequestParam(value = "userToken", defaultValue = "null") String userToken) throws IOException {
        return new OrderService(userToken).getOrderItems();
    }
}