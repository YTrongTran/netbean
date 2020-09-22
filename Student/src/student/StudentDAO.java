/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StudentDAO {
    //tim sinh vien theo id 
    // tim sinh vien theo ten
    // in ra sinh vien co diem tb cao nhat
    //in ra cac sinh vien gioi
    // sua thong tin sinh vien theo id
    // xoa sinh vien theo id 

    List<Student> ls = new ArrayList<>();

    public void inputStudent() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. web");
        System.out.println("2. UD");
        System.out.println("3. MOB");
        Student st = null;
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                st = new StudentWeb();
                st.input();

                break;
            case 2:
                st = new StundentMOB();
                st.input();
                break;
            case 3:
                st = new studentUD();
                st.input();
                break;
        }
        ls.add(st);

    }

    public void outputs() {
        for (Student st : ls) {
            st.output();
        }
    }

    public int findStudent(int id) {
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.getId() == id) {
                pos = i;
            }
        }
        return pos;
    }

    public int findStudent(String name) {
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.getName().equalsIgnoreCase(name)) {
                pos = i;
            }
        }
        return pos;
    }
    //xóa
    public int delStudent(int id){
    int pos = findStudent(id);
        if (pos>=0) {
            ls.remove(pos);
            return pos;
        }
        return pos;
    }
//update
    public  int updateStudent(){
    int pos = findStudent(0);
        if (pos>=0) {
            Student st = ls.get(pos);
            st.input();
            ls.set(pos, st);
            return pos;
            
        }
        return pos;
    }
    public void dataStudent() {
        ls.add(new studentUD(111, 112, 1, "A1", 1000, 1200));
        ls.add(new studentUD(113, 114, 2, "A2", 1300, 1400));
        ls.add(new studentUD(115, 116, 3, "A3", 1500, 1600));
        ls.add(new studentUD(117, 118, 4, "A4", 1700, 1800));
        ls.add(new StudentWeb(111, 112, 1, "A1", 1100, 1300));
        ls.add(new StudentWeb(113, 114, 2, "A2", 1500, 1700));
        ls.add(new StudentWeb(115, 116, 3, "A3", 1900, 2100));
        ls.add(new StudentWeb(117, 118, 4, "A4", 2300, 2500));
        ls.add(new StundentMOB(111, 112, 1, "A1", 1000, 1100));
        ls.add(new StundentMOB(113, 114, 2, "A2", 1200, 1300));
        ls.add(new StundentMOB(115, 116, 3, "A3", 1400, 1500));
        ls.add(new StundentMOB(117, 118, 4, "A4", 1600, 1700));
    }

    public static void main(String[] args) {
        StudentDAO sd = new StudentDAO();
        sd.menu();
    }

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println("1.input");
            System.out.println("2.output");
            System.out.println("ban chon?");
            System.out.println("3. find id");
            System.out.println("4. find name");
            System.out.println("5. dataStudent:");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputStudent();
                    break;
                case 2:
                    outputs();
                    break;
                case 3:
                    System.out.println(" nhap id can tim:");
                    int pos = findStudent(sc.nextInt());
                    if (pos < 0) {
                        System.out.println("khong tim thay");

                    } else {
                        Student st = ls.get(pos);
                        st.output();
                    }
                case 4:
                    System.out.println("nhap name can tim");
                    int pos1 = findStudent(sc.nextLine());
                    if (pos1 < 0) {
                        System.out.println("khong tim thay");

                    } else {
                        Student s = ls.get(pos1);
                        s.output();
                    }
                case 5:
                    dataStudent();
                    break;
            }
        }
    }
}
