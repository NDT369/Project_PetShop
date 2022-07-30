/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;
import model.Customer;

/**
 *
 * @author DUC THINH
 */
public class AccountDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public Account checkAccount(String username, String password) {
        String sql = "select * from account\n"
                + "where username=? and password=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                account.setPassword(password);
                account.setRole(rs.getBoolean("role"));
                return account;
            }

        } catch (SQLException e) {
        }
        return null;
    }

    public Account CheckUserExist(String username) {
        String sql = "select * from account\n"
                + "where username=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                return account;
            }

        } catch (SQLException e) {
        }
        return null;
    }
    
    public void addNewAccount(Account account) {
        String sql = "insert into account values(?,?,0)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        Account account1 = new Account();;
        String sql1 = "select * from account where username=?";
        try {
            ps = connection.prepareStatement(sql1);
            ps.setString(1, account.getUsername());
            rs = ps.executeQuery();
            if (rs.next()) {
                account1.setAccountID(rs.getInt("accountid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        String sql2 = "insert into customers (accountid) values (?)";
        try {
            ps = connection.prepareStatement(sql2);
            ps.setInt(1, account1.getAccountID());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }   

    public void changePassWord(Account account) {
        String sql = "update account set password=? where username=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, account.getPassword());
            ps.setString(2, account.getUsername());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public Customer getCusIdByAccount(String name) {
        Customer c = new Customer();
        String sql = "select * from account\n"
                + "inner join customers \n"
                + "on account.accountid = customers.accountid\n"
                + "where username = ?";
        try {
            
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setCus_id(rs.getInt("customer_id"));
            }
        } catch (SQLException ex) {
        }
        return c;
    }
    
    public static void main(String[] args) {
        AccountDAO Ad = new AccountDAO();
        System.out.println(Ad.getCusIdByAccount("thinh").getCus_id());     
    }
}
