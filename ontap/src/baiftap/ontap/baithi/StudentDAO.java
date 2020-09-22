/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiftap.ontap.baithi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StudentDAO {
    ArrayList<Student> ls = new ArrayList<>();
    
    public void inputStudent(){  
    int choice = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("1.Kiểm tra StudentJAVA.");
        Student st =null;
        choice =sc.nextInt();
        switch(choice){
            case 1:
                st = new StudentJava();
                st.inputStudent();
               
                break;
            
                
        
        }
    ls.add(st);
    
     }
    
    public void getallStudent(){
        for (Student st : ls) {
            st.printStudent();
        }
    }
    public void addList(){
    ls.add(new StudentJava(8, 10, " 1 ", " Nam ", " 122.Danang ", 14));
    ls.add(new StudentJava(10, 10, " 2 ", "Nguyệt", " 123.Danang ", 14));
    ls.add(new StudentJava(8.5, 8.5, " 3 ", "Nam", " 122.Quangnam ", 14));
    ls.add(new StudentJava(6, 4.5, " 4 ", "Nu", " 222.Danang ", 14));
    ls.add(new StudentJava(5, 9.5, " 5 ", "Nuy", " 124.Danang ", 14));
    ls.add(new StudentJava(4.5, 8.5, " 6 ", "Num", " 126.Danang ", 14));
    ls.add(new StudentJava(3.5, 7.5, " 7 ", "Non", " 127.Danang ", 14));
    ls.add(new StudentJava(2.5, 6.5, " 8 ", "Ninh", " 128.Danang ", 14));
    ls.add(new StudentJava(5.5, 4.5, " 9 ", "Nghiem", " 130.Danang ", 14));
    
    }
    //tìm kiếm id
    public int findStudentByID(String id){
    int pos =-1;
        for (int i = 0; i < ls.size(); i++) {
            Student st =ls.get(i);
            if (st.getId() == id) {
                pos=i;
            }
        }
    return pos;
    }
    public int deleteStudentByID(String id){
    int pos =findStudentByID(id);
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (pos >= 0) {
                ls.remove(pos);
            }
            
        }
    return pos;
    }
    public void getArrangeStudentByAverage(){
        for (int i = 0; i < ls.size()-1; i++) {
            for (int j = 0; j < ls.size(); j++) {
                Student temp;
                if (ls.get(i).getAge()>ls.get(j).getAge()) {
                    temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        StudentDAO sdo = new StudentDAO();
        sdo.inputStudent();
        sdo.getallStudent();
        sdo.getArrangeStudentByAverage();
    }
}
