/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haubeo
 */
public class StudentDAO {
    public static ArrayList<Student> ls=new ArrayList<>();
    public static int t=-1;
      public static int v=-1;
      SimpleDateFormat dd=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat ddd=new SimpleDateFormat("yyyy-MM-dd");
    public int add(Student ee) throws SQLException{
        Connection conn=null;
            PreparedStatement sttm=null;
     
        try {
            
            
            //String ssql="insert employees3(fullname,age,address) values('leduan',20,'danang');  ";
            String ssql="insert student(id,name,phone,email,ngaysinh) values(?,?,?,?,?) ;";
            conn=DatabaseUtils.getDBConnect();
            sttm=conn.prepareStatement(ssql);
            sttm.setInt(1,ee.getId());
            sttm.setString(2, ee.getName());
            
            sttm.setString(3,ee.getPhone());
            sttm.setString(4,ee.getEmail());
             sttm.setString(5,ddd.format(ee.getNgaysinh()));
            if(sttm.executeUpdate()>0){
                System.out.println("them thanh cong");
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            sttm.close();
            conn.close();
        }
        return -1;
    }
     public ArrayList<Student> geta(int t) {
           ArrayList<Student> lk=new ArrayList<>();
        try {
            lk.add(getALL().get(t));
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lk;
     }
      public ArrayList<Student> gete(int t) {
           ArrayList<Student> lk=new ArrayList<>();
        try {
            lk.add(getALL().get(t));
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lk;
     }
    public ArrayList<Student> getALL() throws SQLException{
        ArrayList<Student> ls=new ArrayList<>();
     Connection conn=null;
       Statement sttm=null;
        ResultSet rs;
         try{
           //String ssql="insert employees3(fullname,age,address) values('leduan',20,'danang');  ";
           String ssql="select id,name,phone,email,ngaysinh from student ;";
            conn=DatabaseUtils.getDBConnect();
          sttm=conn.createStatement();
          rs=sttm.executeQuery(ssql);
//         sttm.setString(1, ee.getName());
//         sttm.setInt(2, ee.getAge());
//         sttm.setString(3,ee.getAddress());
        // sttm.setInt(1, id);
          while(rs.next()){
              Student ee=new Student();
              ee.setId(rs.getInt(1));
              ee.setName(rs.getString(2));
              ee.setPhone(rs.getString(3));
              ee.setEmail(rs.getString(4));
             ee.setNgaysinh(ddd.parse(rs.getString(5)));
         ls.add(ee);
          }
            
       } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            sttm.close();
            conn.close();
        } 
         return ls;
     
    }
    public int edit(int a,Student ee) throws SQLException{
        Connection conn=null;
        PreparedStatement sttm=null;
       try{
           //String ssql="insert employees3(fullname,age,address) values('leduan',20,'danang');  ";
           String ssql="UPDATE student SET  name=? ,phone=?,email=?,ngaysinh=?  WHERE id = ?;";
            conn=DatabaseUtils.getDBConnect();
          sttm=conn.prepareStatement(ssql);
         sttm.setInt(5, ee.getId());
         sttm.setString(1, ee.getName());
        sttm.setString(2,ee.getPhone());
         
         sttm.setString(3, ee.getEmail());
        sttm.setString(4,ddd.format(ee.getNgaysinh()));
         
        // getall().set(id, ee);
            if(sttm.executeUpdate()>0){
                System.out.println("sua thanh cong");
                return 1;}
       } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }finally{
            sttm.close();
            conn.close();
        } 
       return -1;
    }
    public int find(int id){
          int p=-1;
        try {
          
            for(int i=0;i<getALL().size();i++){
                if(id==getALL().get(i).getId()){
                    p=i;
                }
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return p;
    }
    public int delete(int id) throws SQLException{
        Connection conn=null;
        PreparedStatement sttm=null;
       try{
           //String ssql="insert employees3(fullname,age,address) values('leduan',20,'danang');  ";
           String ssql="delete student  where id=?";
            conn=DatabaseUtils.getDBConnect();
          sttm=conn.prepareStatement(ssql);
//         sttm.setString(1, ee.getName());
//         sttm.setInt(2, ee.getAge());
//         sttm.setString(3,ee.getAddress());
         sttm.setInt(1,getALL().get(id).getId());
        // getall().remove(id);
            if(sttm.executeUpdate()>0){
                System.out.println(" xoa thanh cong");
                return 1;}
       } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }finally{
            sttm.close();
            conn.close();
        }
       return -1;
    }
}
