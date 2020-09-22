/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class StudentDAO {
    public List<Student> getAll() {
        List<Student> lshv = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "select st.id,st.name,st.birthday,st.MajorId, ml.name from Student st INNER JOIN Major1 ml ON st.MajorId = ml.id";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                Student d = new Student();
                d.setId(rs.getString(1));
                d.setName(rs.getString(2));
                d.setBirthday(rs.getDate(3));
                d.setMajor(new Major(rs.getInt(4), rs.getString(5)));
                lshv.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {

                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return lshv;
    }

    public int add(Student st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Student (id, \"name\", birthday, MajorId) \n"
                    + "	VALUES (?, ?,?, ?)\n"
                    + "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, st.getName());
            sttm.setString(3, DataHelps.toString(st.getBirthday()));
            sttm.setInt(4, st.getMajor().getId());

            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();

            } catch (Exception e) {

            }
        }
        return -1;
    }
 public int save(Student st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Student SET \"id\" = ?, "
                    + "\"name\" = ?, \"birthday\" =?, "
                    + "\"MajorId\" = ? WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, st.getName());
            sttm.setString(3, DataHelps.toString(st.getBirthday()));
            sttm.setInt(4, st.getMajor().getId());
            sttm.setString(6, st.getId());

            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();

            } catch (Exception e) {

            }
        }
        return -1;
    }
  public int delete(Student st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Student WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();

            } catch (Exception e) {

            }
        }
        return -1;
    }
  public Student getStudentBYID(String id) {
        Student kh = new Student();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Student where id= ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {
                kh.setId((rs.getString(1)));
                kh.setName(rs.getString(2));
                kh.setBirthday(DataHelps.todate(rs.getString(3)));
                kh.setMajor(new Major(Integer.parseInt(rs.getString(4)),rs.getString(4)));
              
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        List<Student> ls = dao.getAll();
        for (Student l : ls) {
            System.out.println(l.toString());
        }
    }

}
