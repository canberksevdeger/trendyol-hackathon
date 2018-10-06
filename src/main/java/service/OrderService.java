package service;

import entity.cargo.CargoDetail;
import entity.order_detail.OrderDetail;
import entity.order_detail.OrderItems;
import entity.order_detail.OrderItemsItem;
import entity.order_detail.ProductsItem;
import entity.orders.Orders;
import entity.orders.OrdersItem;
import repository.OrderRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderService {

    String userToken;

    public OrderService(String userToken){
        this.userToken = userToken;
    }

    public Orders getOrderList(){
        return new OrderRepository(userToken).getOrderList();
    }

    public OrderDetail getOrderDetailById(String orderId){
        return new OrderRepository(userToken).getOrderDetailById(orderId);
    }

    public List<Integer> getOrderIds(Orders orders){
        List<Integer> orderIds = new ArrayList<>();
        List<OrdersItem> ordersItems = orders.getOrders();

        for (OrdersItem item: ordersItems) {
            orderIds.add(item.getOrderParentId());
        }
        return orderIds;
    }

    public OrderItems getOrderItems() throws IOException {
        OrderItems orderItems = new OrderItems();
        List<OrderItemsItem> orderItemList = new ArrayList<>();

        for (int orderId: getOrderIds(getOrderList())) {
            OrderDetail orderDetail = getOrderDetailById(Integer.toString(orderId));

            for (OrderItemsItem orderItem: orderDetail.getOrderItems()) {
                int productSize = orderItem.getProducts().size();
                if (productSize>3){
                    List<ProductsItem> productsItems = new ArrayList<>();
                    for (int i = 0; i<3; i++) {
                        productsItems.add(orderItem.getProducts().get(i));
                    }
                    orderItem.setProducts(productsItems);
                }

                if (orderItem.getCargoUrl() == null
                        || orderItem.getCargoUrl().isEmpty()){
                    CargoDetail cargoDetail = new CargoDetail();
                    cargoDetail.setCargoName("");
                    cargoDetail.setCargoStatus("");
                    cargoDetail.setCargoHour("");
                    cargoDetail.setCargoDate("");
                    orderItem.setCargoDetail(cargoDetail);
                    orderItem.setShowCargoDetail(false);
                }
                else {
                    if (orderItem.getCargoUrl().contains("araskargo")){
                        String cargoId = orderItem.getCargoUrl().split("=")[1];
                        CargoDetail cargoDetail = new ArasService().getLastCargoActions(cargoId);
                        orderItem.setCargoDetail(cargoDetail);
                        orderItem.setShowCargoDetail(true);

                    } else if (orderItem.getCargoUrl().contains("mngkargo")){
                        String cargoId = orderItem.getCargoUrl().split("=")[1];
                        CargoDetail cargoDetail = new MNGService().getLastCargoActions(cargoId);
                        orderItem.setCargoDetail(cargoDetail);
                        orderItem.setShowCargoDetail(true);

                    } else if (orderItem.getCargoUrl().contains("yurticikargo")){
                        String cargoId = orderItem.getCargoUrl().split("=")[1];
                        CargoDetail cargoDetail = new YurticiService().getLastCargoActions(cargoId);
                        orderItem.setCargoDetail(cargoDetail);
                        orderItem.setShowCargoDetail(true);
                    }
                }
                orderItemList.add(orderItem);
            }
        }

        orderItems.setOrderItems(orderItemList);
        return orderItems;
    }
}
