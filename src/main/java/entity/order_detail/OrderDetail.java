package entity.order_detail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class OrderDetail{

	@JsonProperty("refundedPrice")
	private int refundedPrice;

	@JsonProperty("refundedCount")
	private int refundedCount;

	@JsonProperty("claimDescription")
	private String claimDescription;

	@JsonProperty("orderNumber")
	private String orderNumber;

	@JsonProperty("orderId")
	private int orderId;

	@JsonProperty("totalPrice")
	private int totalPrice;

	@JsonProperty("addressUpdatable")
	private boolean addressUpdatable;

	@JsonProperty("invoiceAddress")
	private InvoiceAddress invoiceAddress;

	@JsonProperty("productCount")
	private int productCount;

	@JsonProperty("orderItems")
	private List<OrderItemsItem> orderItems;

	@JsonProperty("deliveryAddress")
	private DeliveryAddress deliveryAddress;

	@JsonProperty("orderNumberPrefix")
	private String orderNumberPrefix;

	@JsonProperty("deliveryMessageBoldField")
	private String deliveryMessageBoldField;

	@JsonProperty("deliveryMessage")
	private String deliveryMessage;

	@JsonProperty("voidedCount")
	private int voidedCount;

	@JsonProperty("deliveryCount")
	private int deliveryCount;

	@JsonProperty("orderDate")
	private String orderDate;

	@JsonProperty("paymentInfo")
	private PaymentInfo paymentInfo;

	public void setRefundedPrice(int refundedPrice){
		this.refundedPrice = refundedPrice;
	}

	public int getRefundedPrice(){
		return refundedPrice;
	}

	public void setRefundedCount(int refundedCount){
		this.refundedCount = refundedCount;
	}

	public int getRefundedCount(){
		return refundedCount;
	}

	public void setClaimDescription(String claimDescription){
		this.claimDescription = claimDescription;
	}

	public String getClaimDescription(){
		return claimDescription;
	}

	public void setOrderNumber(String orderNumber){
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber(){
		return orderNumber;
	}

	public void setOrderId(int orderId){
		this.orderId = orderId;
	}

	public int getOrderId(){
		return orderId;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

	public int getTotalPrice(){
		return totalPrice;
	}

	public void setAddressUpdatable(boolean addressUpdatable){
		this.addressUpdatable = addressUpdatable;
	}

	public boolean isAddressUpdatable(){
		return addressUpdatable;
	}

	public void setInvoiceAddress(InvoiceAddress invoiceAddress){
		this.invoiceAddress = invoiceAddress;
	}

	public InvoiceAddress getInvoiceAddress(){
		return invoiceAddress;
	}

	public void setProductCount(int productCount){
		this.productCount = productCount;
	}

	public int getProductCount(){
		return productCount;
	}

	public void setOrderItems(List<OrderItemsItem> orderItems){
		this.orderItems = orderItems;
	}

	public List<OrderItemsItem> getOrderItems(){
		return orderItems;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress){
		this.deliveryAddress = deliveryAddress;
	}

	public DeliveryAddress getDeliveryAddress(){
		return deliveryAddress;
	}

	public void setOrderNumberPrefix(String orderNumberPrefix){
		this.orderNumberPrefix = orderNumberPrefix;
	}

	public String getOrderNumberPrefix(){
		return orderNumberPrefix;
	}

	public void setDeliveryMessageBoldField(String deliveryMessageBoldField){
		this.deliveryMessageBoldField = deliveryMessageBoldField;
	}

	public String getDeliveryMessageBoldField(){
		return deliveryMessageBoldField;
	}

	public void setDeliveryMessage(String deliveryMessage){
		this.deliveryMessage = deliveryMessage;
	}

	public String getDeliveryMessage(){
		return deliveryMessage;
	}

	public void setVoidedCount(int voidedCount){
		this.voidedCount = voidedCount;
	}

	public int getVoidedCount(){
		return voidedCount;
	}

	public void setDeliveryCount(int deliveryCount){
		this.deliveryCount = deliveryCount;
	}

	public int getDeliveryCount(){
		return deliveryCount;
	}

	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}

	public String getOrderDate(){
		return orderDate;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo){
		this.paymentInfo = paymentInfo;
	}

	public PaymentInfo getPaymentInfo(){
		return paymentInfo;
	}

	@Override
 	public String toString(){
		return 
			"OrderDetail{" + 
			"refundedPrice = '" + refundedPrice + '\'' + 
			",refundedCount = '" + refundedCount + '\'' + 
			",claimDescription = '" + claimDescription + '\'' + 
			",orderNumber = '" + orderNumber + '\'' + 
			",orderId = '" + orderId + '\'' + 
			",totalPrice = '" + totalPrice + '\'' + 
			",addressUpdatable = '" + addressUpdatable + '\'' + 
			",invoiceAddress = '" + invoiceAddress + '\'' + 
			",productCount = '" + productCount + '\'' + 
			",orderItems = '" + orderItems + '\'' + 
			",deliveryAddress = '" + deliveryAddress + '\'' + 
			",orderNumberPrefix = '" + orderNumberPrefix + '\'' + 
			",deliveryMessageBoldField = '" + deliveryMessageBoldField + '\'' + 
			",deliveryMessage = '" + deliveryMessage + '\'' + 
			",voidedCount = '" + voidedCount + '\'' + 
			",deliveryCount = '" + deliveryCount + '\'' + 
			",orderDate = '" + orderDate + '\'' + 
			",paymentInfo = '" + paymentInfo + '\'' + 
			"}";
		}
}