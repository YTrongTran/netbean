/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlySach;

import Datautiles.DatabaseUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class NhxbDAO {
    public List<NhaXuatBan> getAllNhaXuatBan() {
        List<NhaXuatBan> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT  ma_nxb, ten_nxb, dia_chi\n" +
"FROM dbo.NhaXuatBan";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NhaXuatBan u = new NhaXuatBan();
                u.setMaXB(Integer.parseInt(rs.getString(1)));
                u.setTenXB(rs.getString(2));
                u.setDiaChi(rs.getString(3));
                ls.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
     public int findnhaXuatban(String ten) {
        int p = -1;
        for (int i = 0; i < getAllNhaXuatBan().size(); i++) {
            if (getAllNhaXuatBan().get(i).getTenXB().equalsIgnoreCase(ten)) {
                p = i;
            }
        }
        return p;
    }
     public int findnhan(int ma) {
        int p = -1;
        for (int i = 0; i < getAllNhaXuatBan().size(); i++) {
            if (ma == getAllNhaXuatBan().get(i).getMaXB()) {
                p = i;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        NhxbDAO dao = new NhxbDAO();
        System.out.println("a"+dao.findnhan(24));
    }
}
