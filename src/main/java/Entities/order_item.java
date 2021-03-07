package Entities;

public class order_item {
    private String order_item_id;
    private double order_price;
    private double order_freight_value;
    private int order_units_available;
    private String order_discount_code;
    private double order_discount_amount;
    private String order_category;
    private String order_name;

    public order_item(){
    }

    public order_item(String order_item_id, double order_price, double order_freight_value, int order_units_available, String order_discount_code, double order_discount_amount, String order_category, String order_name) {
        this.order_item_id = order_item_id;
        this.order_price = order_price;
        this.order_freight_value = order_freight_value;
        this.order_units_available = order_units_available;
        this.order_discount_code = order_discount_code;
        this.order_discount_amount = order_discount_amount;
        this.order_category = order_category;
        this.order_name = order_name;
    }

    public String getOrder_item_id() {
        return order_item_id;
    }

    public double getOrder_price() {
        return order_price;
    }

    public double getOrder_freight_value() {
        return order_freight_value;
    }

    public int getOrder_units_available() {
        return order_units_available;
    }

    public String getOrder_discount_code() {
        return order_discount_code;
    }

    public double getOrder_discount_amount() {
        return order_discount_amount;
    }

    public String getOrder_category() {
        return order_category;
    }

    public String getOrder_name() {
        return order_name;
    }

    @Override
    public String toString() {
        return "item{ID=" + getOrder_item_id() + '\''
                + ", price='" + getOrder_price()+'\''
                + ", freight value=" + getOrder_freight_value()
                + ", units available="+getOrder_units_available()+
                ", order_discount_code="+getOrder_discount_code()+", order_discount_amount="+getOrder_discount_amount()+
                 ", Category=" +getOrder_category()+", Order_name="+getOrder_name() +'}';
    }
}