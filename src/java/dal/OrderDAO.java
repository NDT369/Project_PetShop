/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cart;
import model.Customer;
import model.Item;
import model.Order;
import model.OrderDetail;
import model.Pet;

/**
 *
 * @author DUC THINH
 */
public class OrderDAO extends DBContext {

    public void addOrder(Customer u, Cart c) {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        try {
            // insert vào bảng orders
            String sql = "insert into orders values(?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, u.getCus_id());
            st.setString(2, date);
            st.setDouble(3, c.getTotalMoney());
            st.executeUpdate();

            String sql1 = "select top 1 order_id from orders order by order_id desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : c.getListItem()) {
                    String sql2 = "insert into order_details values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getPet().getPet_id());
                    st2.setInt(3, i.getQuantity());
                    st2.setDouble(4, i.getPrice());
                    st2.executeUpdate();
                }
            }
            
            String sql3 = "UPDATE pets SET quantity = quantity - ? WHERE pet_id = ?";
            PreparedStatement ps3 = connection.prepareStatement(sql3);
            for (Item i : c.getListItem()) {
                ps3.setInt(1, i.getQuantity());
                ps3.setInt(2, i.getPet().getPet_id());
                ps3.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public List<Order> getAllOrder() {
        List<Order> list = new ArrayList<>();
        String sql = "select * from orders";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order();
                o.setOrder_id(rs.getInt("order_id"));
                o.setCus_id(rs.getInt("customer_id"));
                o.setOrder_date(rs.getString("order_date"));
                o.setTotalMoney(rs.getDouble("totalmoney"));
                list.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public List<Order> getTotalMoneyEachDate() {
        List<Order> list = new ArrayList<>();
        String sql = "select order_date, SUM(totalmoney) as summoney from orders\n"
                + "group by order_date";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order();
                o.setOrder_date(rs.getString("order_date"));
                o.setTotalMoney(rs.getDouble("summoney"));
                list.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Double getTotalMoneyByMonth(int month) {
        double totalMoney = 0.0;
        String sql = "select SUM(totalmoney) as summoney from orders\n"
                + "where MONTH(order_date) = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, month);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalMoney = rs.getDouble(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalMoney;
    }

    public void DeleteOrder(int id) {
        String sql = "delete from orders where order_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<OrderDetail> getDetailByAccount(String user) {
        List<OrderDetail> list = new ArrayList<>();
        String sql = "select o.order_date,o.order_id,p.pet_name,od.quantity, od.price from order_details od \n"
                + "inner join orders o on od.order_id = o.order_id\n"
                + "inner join customers c on o.customer_id = c.customer_id\n"
                + "inner join account a on c.accountid = a.accountid\n"
                + "inner join pets p on p.pet_id = od.pet_id\n"
                + "where a.username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                OrderDetail o = new OrderDetail();
                o.setOrder_id(rs.getInt(2));
                o.setQuantity(rs.getInt(4));
                o.setPrice(rs.getDouble(5));
                Pet p = new Pet();
                Order or = new Order();
                p.setPet_name(rs.getString(3));
                or.setOrder_date(rs.getString(1));
                o.setOrder(or);
                o.setPet(p);  
                list.add(o);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

    public static void main(String[] args) {
        OrderDAO od = new OrderDAO();
        System.out.println(od.getTotalMoneyByMonth(3));
    }

}
