package Methods;
import Entities.*;

import java.util.ArrayList;
import java.util.List;

public class Customer_Controller {
    private final Customers repo;
    public Customer_Controller(Customers repo){
        this.repo=repo;
    }
    public String getCustomer(String ID) {
        Customer customer = repo.getCustomer(ID);

        return (customer == null ? "Customer was not found!" : customer.toString());
    }
    public String getAllCustomers() {
        List<Customer> customers = repo.getAllCustomers();

        return customers.toString();
    }
    public String getAddMoney(Double money,String ID){
        Customer customer = repo.getAddMoney(money,ID);
        return "Complite";
    }
    public String getInterestingproductanalyzer(){
        List<Category> category = repo.getInterestingproductanalyzer();
        return category.toString();
}}
