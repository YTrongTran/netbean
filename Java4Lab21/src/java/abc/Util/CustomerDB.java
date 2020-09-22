/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.Util;

import abc.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Y
 */
public class CustomerDB {

    public static List<Customer> getAll() {
        List<Customer> ls = null;
        try {
            String sql = "select * from Customer";
            ls = new ArrayList<>();
            Connection connection = null;
            connection = DatabaseUtils.getDBConnect();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String TenThueBao = rs.getString("TenThueBao");
                String SoDt = rs.getString("Sdt");
                String Diachi = rs.getString("DiaChi");
                Customer c = new Customer();
                c.setId(id);
                c.setTenThueBao(TenThueBao);
                c.setSoDT(SoDt);
                c.setDiaChi(Diachi);
                ls.add(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

}
