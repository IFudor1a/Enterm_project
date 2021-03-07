package Entities;
import java.util.ArrayList;
import java.util.List;
public interface Customers {
   Customer getAddMoney(Double money,String ID);
    List<Customer> getAllCustomers();
    Customer getCustomer(String ID);
    ArrayList<Category> getInterestingproductanalyzer();
}
