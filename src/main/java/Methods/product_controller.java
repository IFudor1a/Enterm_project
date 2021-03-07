package Methods;

import Entities.Customer;
import Entities.Customers;
import Entities.Products;
import Entities.order_item;

import java.util.List;

public class product_controller {
    private final Products repos;
    public product_controller(Products repos){
        this.repos=repos;
    }
    public String getAnylyzeFavouriteProduct(String id) {
        order_item order_item = repos.getAnylyzeFavouriteProduct(id);
        return null;
    }

        public String getOrder(String ID) {
           order_item product = repos.getOrder(ID);

            return (product == null ? "Product was not found!" : product.toString());
        }
    public  String getAllProduct(){
        List<order_item> orders = repos.getAllProduct();
        return orders.toString();
    }
    }
