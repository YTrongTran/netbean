/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author trany
 */
public class TestDB {

    public static void main(String[] args) throws SQLException {
        Connection conn = DatabaseUtils.getDBconnect();
        if (conn != null) {
            System.out.println("Ket noi thanh cong");
            User u = new User();
//            u.add();
//            u.Edit();
//            u.dell();
u.getALLUser();
        } else {
            System.out.println("Ket noi khong thanh cong");
        }
    }
}
