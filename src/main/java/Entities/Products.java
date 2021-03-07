package Entities;

import java.util.List;

public interface Products {
     List<order_item> getAllProduct();
     void getaddInventory();
     void getprofabilitycalculator();
     boolean isSeasonalProduct();
     order_item getOrder(String id);
     order_item getAnylyzeFavouriteProduct(String id);

}
