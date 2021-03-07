package Methods;
import Entities.Category;
import Entities.Customer;
import Entities.Products;
import Entities.order_item;
import PostgresDB.IDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class product_functions implements Products {
    private final IDB db;
    public product_functions(IDB db){
        this.db=db;
    }

    @Override
    public List<order_item> getAllProduct() {
        Connection con=null;
        try{
            con=db.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select*from order_item;");
            List<order_item> orders = new ArrayList<>();
            while(rs.next()){
                order_item orderItem= new order_item(rs.getString("order_item_id"),rs.getDouble("order_price"),rs.getDouble("order_freight_value"),
                        rs.getInt("order_units_available"),rs.getString("order_discount_code"),rs.getDouble("order_discount_amount"),rs.getString("order_category"),
                        rs.getString("order_name"));
                orders.add(orderItem);
            }
            return orders;
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
    public void getaddInventory() {

    }

    @Override
    public void getprofabilitycalculator() {

    }

    @Override
    public boolean isSeasonalProduct() {
        return false;
    }

    @Override
    public order_item getOrder(String id) {
            Connection con = null;
            try {
                con = db.getConnection();
                String sql = "SELECT * FROM order_item WHERE order_item_id=?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, id);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    order_item orderItem= new order_item(rs.getString("order_item_id"),rs.getDouble("order_price"),rs.getDouble("order_freight_value"),
                            rs.getInt("order_units_available"),rs.getString("order_discount_code"),rs.getDouble("order_discount_amount"),rs.getString("order_category"),
                            rs.getString("order_name"));
                    System.out.println("Favourite proudct is=" +orderItem.getOrder_name());
                    return orderItem;
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
    public order_item getAnylyzeFavouriteProduct(String id) {
        Connection con = null;
        try {
            order_item orders= new order_item();
            con = db.getConnection();
            String sql = "select order_item_id from transaction inner join customer on customer.customer_id = transaction.customer_id where transaction .customer_id=? Group by order_item_id order by count(order_item_id) desc limit 1;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Category category = new Category(rs.getString("order_item_id"));
                String res=category.getProduct_name();
                getOrder(res);
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




}
