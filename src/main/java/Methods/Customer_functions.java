package Methods;

import Entities.Customers;
import Entities.Customer;
import PostgresDB.IDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Entities.Category;

public class Customer_functions implements Customers {
  private final IDB db;
  public Customer_functions(IDB db){
      this.db=db;
  }
    @Override
    public Customer getAddMoney(Double money,String ID) {
        Connection con=null;
        try{
            con=db.getConnection();
            Customer customer= new Customer();
            System.out.println("Available money:"+getCustomer(ID).getMoney());
            PreparedStatement st = con.prepareStatement("UPDATE customer set customer_availablemoney =customer_availablemoney+? where customer_id=?;");
            st.setDouble(1, money);
            st.setString(2,ID);
            st.executeUpdate();
            System.out.println("Money now:"+ getCustomer(ID).getMoney());
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
   return null;
  }

    @Override
    public List<Customer> getAllCustomers() {
        Connection con=null;
        try{
            con=db.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select*from customer;");
            List<Customer> customers = new ArrayList<>();
            while(rs.next()){
            Customer customer= new Customer(rs.getString("customer_id"),rs.getString("customer_name"),rs.getString("customer_surname"),
                    rs.getString("customer_dateofbirth"),rs.getString("gender"),rs.getString("customer_country"),rs.getString("customer_region"),
                    rs.getString("customer_city"),rs.getString("customer_phone"),rs.getString("customer_email"),rs.getString("customer_occupancy"),
                    rs.getString("customer_agegroup"),rs.getDouble("customer_availablemoney"));
                    customers.add(customer);
            }
                    return customers;
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();}
        finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Customer getCustomer(String ID) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM customer WHERE customer_id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ID);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Customer customer= new Customer(rs.getString("customer_id"),rs.getString("customer_name"),rs.getString("customer_surname"),
                        rs.getString("customer_dateofbirth"),rs.getString("gender"),rs.getString("customer_country"),rs.getString("customer_region"),
                        rs.getString("customer_city"),rs.getString("customer_phone"),rs.getString("customer_email"),rs.getString("customer_occupancy"),
                        rs.getString("customer_agegroup"),rs.getDouble("customer_availablemoney"));

                return customer;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public ArrayList<Category> getInterestingproductanalyzer() {
        Connection con = null;
        try {
            ArrayList<Category>categories=new ArrayList<>();
            con = db.getConnection();
            String sql = "select order_name from order_item Group by order_name order by count(order_name) desc limit 3;  ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
           Category category = new Category(rs.getString("order_name"));
           categories.add(category);
            }
            return categories;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
