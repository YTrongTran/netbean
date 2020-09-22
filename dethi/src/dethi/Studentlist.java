/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethi;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Studentlist {
    List<StudentJava> ls = new ArrayList<>();
    public void inputs () {
         String tt = " y";
        Scanner sc = new Scanner(System.in);
        do {            
          StudentJava sj = new StudentJava();
          sj.input();
          ls.add(sj);
            System.out.println("tiếp tục chọn (y/n) ? ");
            tt=sc.nextLine();
        } while (tt.equalsIgnoreCase(tt));
        
    
    }
    public void getAllStudent ( ) {
    for (StudentJava sj:ls){
     sj.printStudent();
    }
   
    }
    //tìm kiếm id
    public int findStudentByID(String id){
    int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            StudentJava sj = ls.get(i);
            if (sj.getId() ==id ) {
                pos = i;
            }
        }
  return pos;
    }
    public void data (){
    ls.add(new StudentJava(8, 4, "1", "A01", 12, "122 da nang"));
    ls.add(new StudentJava(8, 8, "2", "A02", 14, "123 da nang"));
    ls.add(new StudentJava(8, 9, "3", "A03", 15, "124 da nang"));
    ls.add(new StudentJava(8, 10,"4", "A04", 16, "125 da nang"));
    ls.add(new StudentJava(8, 1, "5", "A05", 13, "126 da nang"));
    ls.add(new StudentJava(8, 5, "6", "A06", 12, "127 da nang"));
    ls.add(new StudentJava(8, 6, "7", "A07", 12, "128 da nang"));
    
    }
    
    public int deleteStudentByID(String id ){
    int pos = findStudentByID(id);
        if (pos>=0) {
            ls.remove(pos);
        }
    
    return pos;
    }
    
  
    
 
    public void menu(){
            System.out.println("1. nhập: ");
            System.out.println("2. in ra màn hình. ");
            System.out.println("3. tìm kiếm id. ");
            System.out.println("4. xóa tìm kiếm id. ");
            System.out.println("5.data danh sách. ");
        while (true) {            
            Scanner sc = new Scanner(System.in);
            int choice = 0;

            System.out.println("bạn chọn: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    inputs();
                    break;
                case 2:
                    getAllStudent();
                    break;
                case 3: 
                    System.out.println("nhâp id cần tìm: ");
                    int pos = findStudentByID(sc.next());
                    if (pos<0) {
                        System.out.println("không tìm thấy.");
                    } else {
                        StudentJava sj = ls.get(pos);
                        sj.printStudent();
                    }
                case 4:
                    System.out.println("nhập id cần xóa: ");
                    int pos1 = deleteStudentByID(sc.next());
                    if (pos1<0) {
                        System.out.println("không tìm thấy tên cần xóa.");
                    } else {
                        StudentJava sj = ls.get(pos1);
                        sj.printStudent();
                    }
                case 5: 
                    data();
                    break;
                        
                    
            }
          
        }
    }
    
    public void addStudent(){
        StudentJava dataget = new StudentJava();
        dataget.input();
        ls.add(dataget);
    }
    
    public static void main(String[] args) {
        Studentlist sl = new Studentlist();
        sl.menu();
        sl.data();
//        sl.addStudent();
        sl.getAllStudent();
    }
    
} 
