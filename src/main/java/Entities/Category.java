package Entities;

public class Category {
    private String product_name;
    public Category(String name){
        this.product_name=name;
    }

    public String getProduct_name() {
        return product_name;
    }

    @Override
    public String toString(){
        return "Product: " +getProduct_name();
    }
}
