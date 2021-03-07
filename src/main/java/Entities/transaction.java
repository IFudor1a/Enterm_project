package Entities;

public class transaction {
    private String order_id;
    private Customer customer_id;
    private String order_status;
    private String order_purchase_timestamp;
    private String order_item_id;
    private boolean returnValue;
    private int Amount;
    private double Total_price;
    private String Discount_code;

    public transaction(String order_id, Customer customer_id, String order_status, String order_purchase_timestamp, String order_item_id, boolean returnValue, int amount, double total_price, String discount_code) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_status = order_status;
        this.order_purchase_timestamp = order_purchase_timestamp;
        this.order_item_id = order_item_id;
        this.returnValue = returnValue;
        Amount = amount;
        Total_price = total_price;
        Discount_code = discount_code;
    }

    public String getOrder_id() {
        return order_id;
    }

    public Customer getCustomer_id() {
        return customer_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public String getOrder_purchase_timestamp() {
        return order_purchase_timestamp;
    }

    public String getOrder_item_id() {
        return order_item_id;
    }

    public boolean isReturnValue() {
        return returnValue;
    }

    public int getAmount() {
        return Amount;
    }

    public double getTotal_price() {
        return Total_price;
    }

    public String getDiscount_code() {
        return Discount_code;
    }

    @Override
    public String toString() {
        return "Transaction{ order_id ="+getOrder_id()+", customer_id ="+getCustomer_id()+", order_status ="+getOrder_status()+
                ", order_purchase_timestamp ="+getOrder_purchase_timestamp()+", order_item_id ="+getOrder_item_id()+
                ", returnValue ="+isReturnValue()+", Amount ="+getAmount()+
                ", total_price ="+getTotal_price()+", Discount_code ="+getDiscount_code()+"}";
}}
