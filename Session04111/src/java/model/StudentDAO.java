/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import commons.DatabaseUtils;
import commons.DateHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAptop
 */
public class StudentDAO {
    
    private Student student;
    
    public List<Student> getALL() {
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Student> ls = new ArrayList();
        try {
            String sSQL = "Select dbo.Student.id, dbo.Student.name, dbo.Student.birthday, dbo.Major.id, dbo.Major.name from dbo.Student inner join dbo.Major on dbo.Student.MajorId = dbo.Major.id";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                student = new Student();
                student.setId(rs.getString(1));
                student.setName(rs.getString(2));
                student.setBirthday(rs.getDate(3));
                student.setMajor(new Major(rs.getInt(4), rs.getString(5)));
                ls.add(student);
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
        return ls;
    }
    public int insert(Student u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Student (id, name, birthday, MajorId) \n" +
"	VALUES (?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getId());
            sttm.setString(2, u.getName());
            sttm.setString(3, DateHelper.toString(u.getBirthday()));
            sttm.setInt(4, u.getMajor().getId());         
            if (sttm.executeUpdate() > 0) {
                return 1;
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
        return -1;
    }
     public int update(Student u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Staffs SET birthday = ?, email = ?, gender = ?, name = ?,notes =?, phone= ?, photo =?,salary =?,depart_id = ? WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(4, u.getId());
            sttm.setString(1, u.getName());
          
            sttm.setString(2, DateHelper.toString(u.getBirthday()));
            sttm.setInt(3, u.getMajor().getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Edit thanh cong"); 
               return 1;
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
        return -1;
    }

    public int delete(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Staffs WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            if (sttm.executeUpdate() > 0) {
                return 1;
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
        return -1;
    }

    public Student finByID(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        Student s = null;
        try {
            String sSQL = "Select * from  dbo.Staffs where id = ? ";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                s = new Student();
                s.setId(rs.getString(1));
                s.setName(rs.getString(2));
                s.setBirthday(DateHelper.todate(rs.getString(3)));
                s.setMajor( new Major(rs.getInt(4), rs.getString(4)));
                return s;
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
        return s;
    }
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        System.out.println("size"+dao.getALL());
    }
}
