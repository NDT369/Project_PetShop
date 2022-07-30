/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Pet;

/**
 *
 * @author DUC THINH
 */
public class PetDAO extends DBContext {

    public List<Pet> getAllPet() {
        List<Pet> list = new ArrayList<>();
        String sql = "select p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
                + "  p.cateID as cid, c.cateName as cname \n"
                + "  from pets p inner join Category c on p.cateID = c.cateID where p.quantity>0";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    public List<Pet> getNewPet() {
        List<Pet> list = new ArrayList<>();
        String sql = "  select top 4 p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
                + "  p.cateID as cid, c.cateName as cname \n"
                + "  from pets p inner join Category c on p.cateID = c.cateID where p.quantity>0\n"
                + "  ORDER BY p.pet_id DESC";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    public List<Pet> getPopulationPet() {
        List<Pet> list = new ArrayList<>();
        String sql = "select top 4 p.pet_id, sum(o.quantity)as sumquantity, \n"
                + "p.pet_name,p.pet_color,p.pet_price,p.pet_img,\n"
                + "p.pet_sex,p.cateID,p.quantity,p.pet_age, \n"
                + "c.cateID as cid, c.cateName cname from order_details o\n"
                + "inner join pets p on o.pet_id = p.pet_id\n"
                + "inner join Category c on p.cateID = c.cateID \n"
                + "group by p.pet_id, p.pet_name,p.pet_color,p.pet_price,\n"
                + "p.pet_img,p.pet_sex,p.cateID,p.quantity,p.pet_age,c.cateID,c.cateName\n"
                + "order by sumquantity desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    public Pet getTop1Pet() {
        Pet p = new Pet();
        String sql = "select top 1 p.pet_id, sum(o.quantity)as sumquantity, \n"
                + "p.pet_name,p.pet_color,p.pet_price,p.pet_img,\n"
                + "p.pet_sex,p.cateID,p.quantity,p.pet_age, \n"
                + "c.cateID as cid, c.cateName cname from order_details o\n"
                + "inner join pets p on o.pet_id = p.pet_id\n"
                + "inner join Category c on p.cateID = c.cateID \n"
                + "group by p.pet_id, p.pet_name,p.pet_color,p.pet_price,\n"
                + "p.pet_img,p.pet_sex,p.cateID,p.quantity,p.pet_age,c.cateID,c.cateName \n"
                + "order by sumquantity desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return p;
    }

    public List<Pet> getPetNoOneBuy() {
        List<Pet> list = new ArrayList<>();
        String sql = "select p.pet_id, count(o.quantity)as countquantity, \n"
                + "p.pet_name,p.pet_color,p.pet_price,p.pet_img,\n"
                + "p.pet_sex,p.cateID,p.quantity,p.pet_age, \n"
                + "c.cateID as cid, c.cateName cname from order_details o\n"
                + "full outer join pets p on o.pet_id = p.pet_id\n"
                + "inner join Category c on p.cateID = c.cateID \n"
                + "group by p.pet_id, p.pet_name,p.pet_color,p.pet_price,\n"
                + "p.pet_img,p.pet_sex,p.cateID,p.quantity,p.pet_age,c.cateID,c.cateName \n"
                + "having count(o.quantity) = 0";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    public List<Pet> getPetOrder(boolean s) {
        List<Pet> list = new ArrayList<>();
        String sql = "  select p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
                + "  p.cateID as cid, c.cateName as cname \n"
                + "  from pets p inner join Category c on p.cateID = c.cateID \n"
                + "  ORDER BY p.pet_price ";
        if (s == true) {
            sql += " DESC";
        } else {
            sql += "";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    public List<Pet> getPetByCatID(int id) {
        List<Pet> list = new ArrayList<>();
        String sql = "select p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
                + "  p.cateID as cid, c.cateName as cname \n"
                + "  from pets p inner join Category c on p.cateID = c.cateID where p.cateID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    public List<Pet> searchByPetName(String key) {
        List<Pet> list = new ArrayList<>();
        String sql = "select p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
                + "  p.cateID as cid, c.cateName as cname \n"
                + "  from pets p inner join Category c on p.cateID = c.cateID where p.pet_name like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + key + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

//    public List<Pet> checkPet(int[] id) {
//        List<Pet> list = new ArrayList<>();
//        String sql = "  select p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
//                + "  p.cateID as cid, c.cateName as cname \n"
//                + "  from pets p inner join Category c on p.cateID = c.cateID \n"
//                + "  where 1 = 1";
//        if (id != null) {
//            sql += "and p.cateID in(";
//            for (int i = 0; i < id.length; i++) {
//                sql += id[i] + ",";
//            }
//            if (sql.endsWith(",")) {
//                sql = sql.substring(0, sql.length() - 1);
//            }
//            sql += ")";
//        }
//
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            Pet p = new Pet();
//            p.setPet_id(rs.getInt("pet_id"));
//            p.setPet_name(rs.getString("pet_name"));
//            p.setPet_color(rs.getString("pet_color"));
//            p.setPet_sex(rs.getString("pet_sex"));
//            p.setPet_age(rs.getString("pet_age"));
//            p.setPet_price(rs.getInt("pet_price"));
//            p.setPet_img(rs.getString("pet_img"));
//            p.setQuantity(rs.getInt("quantity"));
//            p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
//            list.add(p);
//
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return list;
//    }
    public List<Pet> getListByPage(List<Pet> list, int start, int end) {
        ArrayList<Pet> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public void delete(int id) {
        String sql = "delete from pets where pet_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Pet getPetByID(int id) {
        Pet p = new Pet();
        String sql = "select p.pet_id, p.pet_name, p.pet_color, p.pet_sex, p.pet_age, p.pet_price, p.pet_img, p.quantity,\n"
                + "  p.cateID as cid, c.cateName as cname \n"
                + "  from pets p inner join Category c on p.cateID = c.cateID \n"
                + " where p.pet_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                p.setPet_id(rs.getInt("pet_id"));
                p.setPet_name(rs.getString("pet_name"));
                p.setPet_color(rs.getString("pet_color"));
                p.setPet_sex(rs.getString("pet_sex"));
                p.setPet_age(rs.getString("pet_age"));
                p.setPet_price(rs.getInt("pet_price"));
                p.setPet_img(rs.getString("pet_img"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCate(new Category(rs.getInt("cid"), rs.getString("cname")));
                return p;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public void insert(Pet p) {
        String sql = "insert into pets values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, p.getPet_id());
            st.setString(2, p.getPet_name());
            st.setString(3, p.getPet_color());
            st.setString(4, p.getPet_sex());
            st.setString(5, p.getPet_age());
            st.setInt(6, p.getPet_price());
            st.setString(7, p.getPet_img());
            st.setInt(8, p.getQuantity());
            st.setInt(9, p.getCate().getCateID());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(Pet p) {
        String sql = "update pets set pet_name=?, pet_color=?, pet_sex=?, pet_age=?, pet_price=?, pet_img=?, quantity=?, cateID=? where pet_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, p.getPet_name());
            st.setString(2, p.getPet_color());
            st.setString(3, p.getPet_sex());
            st.setString(4, p.getPet_age());
            st.setInt(5, p.getPet_price());
            st.setString(6, p.getPet_img());
            st.setInt(7, p.getQuantity());
            st.setInt(8, p.getCate().getCateID());
            st.setInt(9, p.getPet_id());
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        PetDAO pd = new PetDAO();
        List<Pet> list = pd.getPetNoOneBuy();
        System.out.println(list.get(0).getPet_name());
    }
}
